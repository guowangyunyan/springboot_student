package com.student.service.impl;

import com.student.dao.UserDao;
import com.student.model.UserForm;
import com.student.model.UserModel;
import com.student.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @param userForm
     * @return
     * @throws
     * @Description: 用户登录
     * @author yx
     * @date 2018/8/23 17:21
     */
    @Override
    public void login(UserForm userForm) {
        logger.info("调用 login 方法");
        //根据用户名和密码查询是否存在数据
        UserModel userModel = userDao.findUserByUsernameAndPassword(userForm.getUsername(), userForm.getPassword());
        if (userModel == null) {

        }
    }

    @Override
    public void insertUser(UserForm userForm) {

    }
}
