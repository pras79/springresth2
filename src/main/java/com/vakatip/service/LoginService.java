package com.vakatip.service;

import com.vakatip.model.Login;
import com.vakatip.model.User;
import com.vakatip.repository.LoginRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pvakati on 1/12/2018.
 */
@Service
public class LoginService {

    @Autowired
    LoginRespository rep;


    public Login verification(String userName, String password) {

        return rep.verifyLoginCredentails(userName, password);

    }

    public String userRegistation(User user) {

        return rep.userRegistration(user);

    }

}
