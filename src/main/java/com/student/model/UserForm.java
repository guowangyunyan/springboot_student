package com.student.model;

/**
 * @ClassName: UserForm
 * @Description: User接收数据实体类
 * @Author: yx
 * @CreateDate: 2018/8/23 17:57
 * @UpdateUser: HP
 * @UpdateDate: 2018/8/23 17:57
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class UserForm {

    private String username;//用户名
    private String loginname;//登录名
    private String password;//密码

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
