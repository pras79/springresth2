package com.vakatip.controller;

import com.vakatip.model.User;
import com.vakatip.service.LoginService;
import com.vakatip.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pvakati on 1/12/2018.
 */

@RestController
public class LoginController {

    private LoginService loginService;
    private User user;

    @Autowired
    LoginController(LoginService logService) {
        this.loginService = logService;
    }

    @RequestMapping("/login")
    public Login verifyLoginCredentials(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        return loginService.verification(userName, password);
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String errorHandler() {

        return "exception occurred during the process";
    }

}
