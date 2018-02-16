package com.vakatip.model;

import org.springframework.stereotype.Component;

/**
 * Created by pvakati on 1/16/2018.
 */

@Component
public class User {

    private String userName;
    private String emailAddress;
    private String userCity;
    private String userGender;
    private String userPassword;

    public User() {

    }

    public User(String userName, String emailAddress, String userCity, String userGender, String userPassword) {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.userCity = userCity;
        this.userGender = userGender;
        this.userPassword = userPassword;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (userCity != null ? !userCity.equals(that.userCity) : that.userCity != null) return false;
        if (userGender != null ? !userGender.equals(that.userGender) : that.userGender != null) return false;
        return userPassword != null ? userPassword.equals(that.userPassword) : that.userPassword == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (userCity != null ? userCity.hashCode() : 0);
        result = 31 * result + (userGender != null ? userGender.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        return result;
    }
}
