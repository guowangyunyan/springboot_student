package com.student.service;

import com.student.model.UserForm;

public interface UserService {
    void login(UserForm userForm);

    void insertUser(UserForm userForm);
}
