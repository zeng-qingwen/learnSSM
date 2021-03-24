package com.zqw.Dao;

import com.zqw.Pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperIml implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public UserMapperIml(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> findAll() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.findAll();
    }

    @Override
    public int insertUser(User user) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return  userMapper.insertUser(user);


    }
}
