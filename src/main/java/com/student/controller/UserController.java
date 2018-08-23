package com.student.controller;

import com.student.model.UserForm;
import com.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: UserController
 * @Description: 用户Controller
 * @Author: yx
 * @CreateDate: 2018/8/23 15:57
 * @UpdateUser: HP
 * @UpdateDate: 2018/8/23 15:57
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @param userForm
     * @return
     * @throws
     * @Description: 用户登录页面
     * @author yx
     * @date 2018/8/23 17:52
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(UserForm userForm) {
        userService.login(userForm);
        return "";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(UserForm userForm) {
        userService.insertUser(userForm);
        return "user/login";
    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 用户登录
     * @author yx
     * @date 2018/8/23 17:52
     */
    @RequestMapping("/login")
    public String login() {
        return "user/login";
    }


}
