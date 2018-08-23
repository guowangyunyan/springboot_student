package com.student.controller;

import com.student.model.UserForm;
import com.student.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @param userForm
     * @return
     * @throws
     * @Description: 用户登录
     * @author yx
     * @date 2018/8/23 17:52
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(UserForm userForm) {
        logger.info("调用 login 接口");
        userService.login(userForm);
        return "";
    }

    /**
     * @param userForm
     * @return
     * @throws
     * @Description: 用户的注册
     * @author yx
     * @date 2018/8/23 18:09
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(UserForm userForm) {
        userService.insertUser(userForm);
        return "user/login";
    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 用户登录页面
     * @author yx
     * @date 2018/8/23 17:52
     */
    @RequestMapping("/login")
    public String login() {
        logger.info("调用 login 接口");
        return "user/login";
    }


}
