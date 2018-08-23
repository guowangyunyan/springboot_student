package com.student.service;

import com.student.model.StudentForm;
import com.student.model.StudentModel;

import java.util.List;

public interface StudentService {
    void insertStudent(StudentForm studentForm);

    void updateStudent(StudentForm studentForm);

    List<StudentModel> listStudent();

    StudentModel getStudent(StudentForm studentForm);
}
