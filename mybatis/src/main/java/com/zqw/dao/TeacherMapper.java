package com.zqw.dao;

import com.zqw.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> findAll();

    List<Teacher> findAllInfo();
    List<Teacher> findAllInfo2();
}
