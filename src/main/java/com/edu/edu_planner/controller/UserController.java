package com.edu.edu_planner.controller;

import com.edu.edu_planner.model.User;
import com.edu.edu_planner.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService){this.userService = userService;}

    @GetMapping
    public List<User> getAllUsers(){return userService.getAllUsers();}

    @PostMapping
    public User createUser(@PathVariable User user){return userService.createUser(user);}

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){return userService.getUserById(id);}

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, User userDetails){return userService.updateUser(id, userDetails);}

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id){return userService.deleteUser(id);}
}
