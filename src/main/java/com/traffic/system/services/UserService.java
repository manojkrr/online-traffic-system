package com.traffic.system.services;

import com.traffic.system.entities.User;

import java.util.List;

public interface UserService {

    User registerUser(User user);

    User loginUser(String username, String password);

    List<User> getAllUsers();
}
