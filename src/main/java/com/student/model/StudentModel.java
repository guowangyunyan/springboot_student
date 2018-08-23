package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: StudentModel
 * @Description: student实体类
 * @Author: HP
 * @CreateDate: 2018/8/22 15:47
 * @UpdateUser: HP
 * @UpdateDate: 2018/8/22 15:47
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Entity
@Table(name = "student")
public class StudentModel {

    private Integer id;//主键

    private String name;//姓名

    @Id
    @GeneratedValue
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

    public StudentModel() {
    }
}
