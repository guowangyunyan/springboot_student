package com.student.controller;

import com.student.model.StudentForm;
import com.student.model.StudentModel;
import com.student.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @param
     * @return
     * @throws
     * @Description: 学生信息添加页面
     * @author yx
     * @date 2018/8/22 15:49
     */
    @RequestMapping(value = "/insertStudent", method = RequestMethod.GET)
    public String insertStudent() {
        logger.info("调用 insertStudent 接口");
        return "/insertStudent";
    }

    /**
     * @param studentForm
     * @return
     * @throws
     * @Description: 学生信息的添加
     * @author yx
     * @date 2018/8/23 9:53
     */
    @RequestMapping(value = "insertStudent", method = RequestMethod.POST)
    @ResponseBody
    public String insertStudent(StudentForm studentForm) {
        logger.info("调用 insertStudent 接口");
        //调用service 方法
        studentService.insertStudent(studentForm);
        //返回数据
        return "添加成功";
    }

    /**
     * @param studentForm
     * @return 10:27
     * @throws
     * @Description: 学生信息的修改
     * @author yx
     * @date 2018/8/23
     */
    @RequestMapping(value = "updateStudent", method = RequestMethod.POST)
    @ResponseBody
    public String updateStudent(StudentForm studentForm) {
        logger.info("调用 updateStudent 接口");
        //调用service 方法
        studentService.updateStudent(studentForm);
        //返回数据
        return "修改成功";
    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 查询全部学生信息
     * @author yx
     * @date 2018/8/23 10:46
     */
    @RequestMapping(value = "listStudent", method = RequestMethod.GET)
    @ResponseBody
    public List listStudent() {
        logger.info("调用 listStudent 接口");
        //调用service 方法
        List<StudentModel> list = studentService.listStudent();
        //返回数据
        return list;
    }

    @RequestMapping(value = "getStudent", method = RequestMethod.GET)
    @ResponseBody
    public StudentModel getStudent(StudentForm studentForm) {
        logger.info("调用 getStudent 接口");
        //调用service 方法
        StudentModel studentModel = studentService.getStudent(studentForm);
        //返回数据
        return studentModel;
    }

}
