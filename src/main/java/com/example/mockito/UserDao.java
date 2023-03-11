package com.example.mockito;

import java.util.List;

public interface UserDao {
    User getByName(String name);

    List<User> findAllUsers();
}
