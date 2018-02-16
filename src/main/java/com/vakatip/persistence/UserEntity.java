package com.vakatip.persistence;

/**
 * Created by pvakati on 2/15/2018.
 */

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String emailAddress;
    private String userCity;
    private String userGender;
    private String userPassword;

    protected UserEntity() {


    }

    public UserEntity(String userName, String emailAddress, String userCity, String userGender, String userPassword) {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.userCity = userCity;
        this.userGender = userGender;
        this.userPassword = userPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

}
