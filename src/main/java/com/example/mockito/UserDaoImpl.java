package com.example.mockito;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {
    private final List<User> list;
    public UserDaoImpl() {
        list = new ArrayList<>();
        list.add(new User("Андрей"));
        list.add(new User("Василий"));
        list.add(new User("Антон"));
        list.add(new User("Сергей"));
        list.add(new User("Пётр"));
    }
    @Override
    public User getByName(String name) {
        for (User user: list) {
       if (user.getName().equals(name)) {
           return user;
       }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return list;
    }
}
