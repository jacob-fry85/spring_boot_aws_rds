package com.jacobfrye.spring_boot_aws_rds.service;

import com.jacobfrye.spring_boot_aws_rds.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String name);
    List<User> findAllUsers();
}
