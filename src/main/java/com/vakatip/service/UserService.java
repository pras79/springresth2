package com.vakatip.service;

import com.vakatip.model.User;
import com.vakatip.persistence.UserEntity;
import com.vakatip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pvakati on 2/13/2018.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private User user;

    public String createUser(User userData) {

        UserEntity userEntity = new UserEntity(
                userData.getUserName(),
                userData.getEmailAddress(),
                userData.getUserCity(),
                userData.getUserGender(),
                userData.getUserPassword());

        userRepository.save(userEntity);
        return "Successfully created the user registration :::" + userData.getUserName();

    }

    public User getUserById(Long userId) {
        UserEntity entity = userRepository.findOne(userId);
        if (entity != null) {
            user.setUserName(entity.getUserName());
            user.setEmailAddress(entity.getEmailAddress());
            user.setUserCity(entity.getUserCity());
            user.setUserGender(entity.getUserGender());

        }
        return user;
    }

    public List<User> getUsersByEmailId(String emailId) {
        List<UserEntity> userList = userRepository.findByEmailAddress(emailId);
        List<User> returnList = new ArrayList<>();
        if (userList != null) {
            for (UserEntity usrEntity : userList) {
                User user1 = new User();
                user1.setUserGender(usrEntity.getUserGender());
                user1.setUserCity(usrEntity.getUserCity());
                user1.setEmailAddress(usrEntity.getEmailAddress());
                user1.setUserName(usrEntity.getUserName());
                returnList.add(user1);

            }

        }
        return returnList;

    }

    public List<UserEntity> getAllUsers() {


        return userRepository.fetchAll();
    }

    public String deleteUser(String userName) {

        return "";
    }


}
