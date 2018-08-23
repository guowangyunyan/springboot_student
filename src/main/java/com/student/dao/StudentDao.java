package com.student.dao;

import com.student.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDao extends JpaRepository<StudentModel, Integer> {

}
