package com.vakatip.controller;

import com.vakatip.exception.CustomException;
import com.vakatip.model.User;
import com.vakatip.persistence.UserEntity;
import com.vakatip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pvakati on 1/30/2018.
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;
    //@Autowired private User userRegistration;

    @PostMapping(value = "/userRegistration")
    public String creteUser(
            @RequestBody User user) {
        String response = userService.createUser(user);

        return response;
    }

    /*
    @GetMapping( value ="/userRegistration/{userId}")
    public User getUserId  (@PathVariable Long userId) throws CustomException {
        return  userService.getUserById( userId);
    } */

    @GetMapping(value = "/userRegistration/{emailAddress}")
    public List<User> getUserDetailsByEmailId(@PathVariable String emailAddress) {
        return userService.getUsersByEmailId(emailAddress);
    }

    @GetMapping(value = "/userRegistration")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();

    }


}
