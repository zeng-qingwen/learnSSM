package com.Spring_Mybatis.Dao;

import com.Spring_Mybatis.Pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperimpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public UserMapperimpl(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> findAll() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.findAll();
    }

    @Override
    public User findUserByid(int id) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.findUserByid(id);
    }
}
