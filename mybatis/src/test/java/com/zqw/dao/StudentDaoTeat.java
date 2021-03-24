package com.zqw.dao;

import com.zqw.pojo.Student;
import com.zqw.utils.MybatisDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class StudentDaoTeat {
    @Test
    public void testFindAll(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testFindAllInfo(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.findAllInfo();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testFindAllInfo2(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.findAllInfo2();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
