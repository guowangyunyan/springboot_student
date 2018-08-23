package com.student.model;

/**
 * @ClassName: StudentForm
 * @Description: 前台接收对象
 * @Author: yx
 * @CreateDate: 2018/8/22 15:50
 * @UpdateUser: HP
 * @UpdateDate: 2018/8/22 15:50
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class StudentForm {
    private Integer id;
    private String name;//姓名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
