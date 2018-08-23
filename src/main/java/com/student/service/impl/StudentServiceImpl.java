package com.student.service.impl;

import com.student.dao.StudentDao;
import com.student.model.StudentForm;
import com.student.model.StudentModel;
import com.student.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Description: StudentService实现类
 * @Author: yx
 * @CreateDate: 2018/8/23 10:45
 * @UpdateUser: HP
 * @UpdateDate: 2018/8/23 10:45
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @param studentForm
     * @return
     * @throws
     * @Description: 学生信息的新增
     * @author yx
     * @date 2018/8/23 9:57
     */
    @Override
    public void insertStudent(StudentForm studentForm) {
        logger.info("调用 insertStudent 方法");
        //新建 StudentModel 对象
        StudentModel studentModel = new StudentModel();
        //给 StudentModel对象赋值
        studentModel.setName(studentForm.getName());
        //保存数据
        studentDao.save(studentModel);

    }


    /**
     * @param studentForm
     * @return
     * @throws
     * @Description: 修改学生信息
     * @author yx
     * @date 2018/8/23 10:44
     */
    @Override
    public void updateStudent(StudentForm studentForm) {
        logger.info("调用 updateStudent 方法");

    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 查询所有学生信息
     * @author yx
     * @date 2018/8/23 10:41
     */
    @Override
    public List<StudentModel> listStudent() {
        logger.info("调用 listStudent 方法");
        //查询全部学生信息
        List<StudentModel> list = studentDao.findAll();
        //返回数据
        return list;
    }

    /**
     * @param studentForm
     * @return
     * @throws
     * @Description: 查询具体学生信息
     * @author yx
     * @date 2018/8/23 11:07
     */
    @Override
    public StudentModel getStudent(StudentForm studentForm) {
        //查询数据
        StudentModel studentModel = studentDao.getOne(studentForm.getId());
        //返回数据
        return studentModel;
    }
}
