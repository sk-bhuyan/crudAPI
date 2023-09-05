package com.crudAPI.services;

import com.crudAPI.entities.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user,long userId);

    void deleteUser(Long userId);
}
