package com.vakatip.repository;

import com.vakatip.CryptoGenerator;
import com.vakatip.model.Login;
import com.vakatip.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by pvakati on 1/12/2018.
 */

@Repository
public class LoginRespository {

    @Autowired
    Login user;
    @Autowired
    CryptoGenerator cryptoGenerator;


    public Login verifyLoginCredentails(String usrName, String password) {

        user.setUserName(usrName);
        String encodedValue = cryptoGenerator.encode(password);
        user.setEncodedValue(encodedValue);
        user.setIspasswordMatched(cryptoGenerator.matches(password, encodedValue));

        return user;

    }

    public String userRegistration(User user) {
        return "successfully created::::::" + user.getUserName();
    }
}
