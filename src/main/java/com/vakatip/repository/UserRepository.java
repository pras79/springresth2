package com.vakatip.repository;

import com.vakatip.persistence.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by pvakati on 2/15/2018.
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {


    UserEntity findUserById(Long id);

    List<UserEntity> findByEmailAddress(String emailAddress);

    @Query("select  userName, emailAddress from UserEntity")
    List<UserEntity> fetchAll();


}
