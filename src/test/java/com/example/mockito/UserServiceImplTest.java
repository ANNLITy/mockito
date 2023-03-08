package com.example.mockito;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    private final User user = new User("Андрей");
    private final User trueUser = new User("Андрей");
    private final User falseUser = new User("324323");


    @Mock
    private UserDao userDaoMock;
    @InjectMocks
    private UserServiceImpl out;

    @Test
    void shouldReturnTrue() {
        when(userDaoMock.getByName(trueUser.getName())).thenReturn(user);
        assertTrue(out.checkUserExist(trueUser));
        verify(userDaoMock, times(1)).getByName(trueUser.getName());
    }

    @Test
    void shouldReturnFalse() {
        when(userDaoMock.getByName(falseUser.getName())).thenReturn(null);
        assertFalse(out.checkUserExist(falseUser));
        verify(userDaoMock, times(1)).getByName(falseUser.getName());
    }
}