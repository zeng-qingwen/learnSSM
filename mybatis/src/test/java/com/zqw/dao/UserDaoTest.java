package com.zqw.dao;

import com.zqw.pojo.User;
import com.zqw.utils.MybatisDBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
public class UserDaoTest {

    @Test
    public void testfindAll() {
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findAll();
        for(User user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testfindUserByid(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findUserByid(1);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testfindUserLike(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findUserLike("%王%");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void testinserUser(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int a = userMapper.inserUser(new User(9,"王维","123456"));

        if(a == 1){
            System.out.println("插入成功");
//            提交事务的代码
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void testupdateUser(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int a = userMapper.updateUser(new User(1,"曾庆文","123456"));
        if(a == 1){
            System.out.println("更新成功");
            sqlSession.commit();
        }


        sqlSession.close();
    }

    @Test
    public void testdeleteUser(){
        SqlSession sqlSession = MybatisDBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int a = userMapper.deleteUser(2);
        if(a == 1){
            System.out.println("删除成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }
}
