package com.zqw.dao;



import com.zqw.pojo.Student;

import java.util.List;

public interface StudentMapper {
//    查出全部的学生类
    List<Student> findAll();

//    查出全部学生的全部信息子查询
    List<Student> findAllInfo();

//     非子查询
    List<Student> findAllInfo2();

}
