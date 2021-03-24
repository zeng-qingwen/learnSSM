package com.Spring_Mybatis.Dao;

import com.Spring_Mybatis.Pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    User findUserByid(int id);
}
