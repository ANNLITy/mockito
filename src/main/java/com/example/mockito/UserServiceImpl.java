package com.example.mockito;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private  UserDao userDao;



    @Override
    public boolean checkUserExist(User user) {
        User u = userDao.getByName(user.getName());
        return u != null;
    }
}
