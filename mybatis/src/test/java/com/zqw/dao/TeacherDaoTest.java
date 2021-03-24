package com.zqw.dao;

import com.zqw.pojo.Teacher;
import com.zqw.utils.MybatisDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherDaoTest {

    @Test
    public void testFindAll() {
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.findAll();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void testFindAllInfo(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.findAllInfo();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void testFindAllInfo2(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.findAllInfo2();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
}
