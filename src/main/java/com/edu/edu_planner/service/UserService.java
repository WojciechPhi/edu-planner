package com.edu.edu_planner.service;

import com.edu.edu_planner.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createUser(@RequestBody User user);

    User getUserById(@PathVariable Long id);

    User updateUser(@PathVariable Long id, @RequestBody User userDetails);

    User deleteUser(@PathVariable Long id);
}
