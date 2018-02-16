package com.vakatip.model;

import org.springframework.stereotype.Component;

/**
 * Created by pvakati on 1/16/2018.
 */
@Component
public class Login {

    String userName;
    String password;
    String encodedValue;
    boolean ispasswordMatched;

    public boolean isIspasswordMatched() {
        return ispasswordMatched;
    }

    public void setIspasswordMatched(boolean ispasswordMatched) {
        this.ispasswordMatched = ispasswordMatched;
    }

    public String getEncodedValue() {
        return encodedValue;
    }

    public void setEncodedValue(String encodedValue) {
        this.encodedValue = encodedValue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
