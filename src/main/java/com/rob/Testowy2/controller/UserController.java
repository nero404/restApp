package com.rob.Testowy2.controller;

import com.rob.Testowy2.model.User;
import com.rob.Testowy2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user")
    public List<User> getUsers(){
        List<User> users = userService.findAllUsers();
        return users;

    }

    @PostMapping(value = "/user")
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable int id){
        return userService.findUserById(id);

    }
    @DeleteMapping(value = "/user/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
    }
    @PutMapping(value = "/user/{id}")
    public void updateUser(@RequestBody User user, @PathVariable int id){
        User currentUser = userService.findUserById(id);
        currentUser.setAge(user.getAge());
        currentUser.setName(user.getName());
        userService.updateUser(currentUser);
    }

}
