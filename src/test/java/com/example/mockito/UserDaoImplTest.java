package com.example.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDaoImplTest {
    private final User trueUser = new User("Сергей");

    private final User falseUser = new User("1");

    private final UserDaoImpl userDao;

    UserDaoImplTest() {
        this.userDao = new UserDaoImpl();
    }

    @Test
    public void shouldReturnUserByName() {
        Assertions.assertEquals(trueUser, userDao.getByName(trueUser.getName()));
    }

    @Test
    public void shouldReturnNullByName() {
        Assertions.assertNull(userDao.getByName(falseUser.getName()));
    }
}
