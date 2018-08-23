package com.student.dao;

import com.student.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<UserModel, Integer> {
    @Query("from UserModel where username=1 and password=2 ")
    UserModel findUserByUsernameAndPassword(String username, String password);
}
