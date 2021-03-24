package com.zqw.controller;

import com.alibaba.fastjson.JSON;
import com.zqw.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {

    @RequestMapping(value = "/json1", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String json1(){
        List<User> users = new ArrayList<>();
        User user2 = new User(12,"曾庆文2","20");
        User user3 = new User(12,"曾庆文3","20");
        User user1 = new User(12,"曾庆文1","20");
        User user4 = new User(12,"曾庆文4","20");
        User user5 = new User(12,"曾庆文5","20");
        User user6 = new User(12,"曾庆文6","20");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        return JSON.toJSONString(users);
    }
}
