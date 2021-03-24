package com.zqw.Dao;

import com.zqw.Pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    int insertUser(User user);
}
