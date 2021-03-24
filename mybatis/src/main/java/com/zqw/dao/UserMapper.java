package com.zqw.dao;

import com.zqw.pojo.User;

import java.util.List;

public interface UserMapper {

//    查询全部用户
    List<User>  findAll();

//    根据id查询用户
    List<User> findUserByid(int id);

//    模糊查询
    List<User> findUserLike(String str);

//    insert user数据
    int inserUser(User user);

//    updata user 数据
    int updateUser(User user);

//      delete user数据
    int deleteUser(int id);

}
