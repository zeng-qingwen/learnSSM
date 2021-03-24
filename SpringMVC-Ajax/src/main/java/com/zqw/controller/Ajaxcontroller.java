package com.zqw.controller;

import com.zqw.Pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Ajaxcontroller {

    @RequestMapping("/test1")
    public String test1(){
        return "hello";
    }

    @RequestMapping("/a/{name}")
    public void ajax(@PathVariable("name") String name, HttpServletResponse response) throws IOException {
        System.out.println("ajax:param=>"+name);
        if("zqw".equals(name)){
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/getUsers")
    public List<User> getUser(){
        List<User> users = new ArrayList<User>();
        users.add(new User("曾庆文",21,"男"));
        users.add(new User("李白",21,"男"));
        users.add(new User("杜甫",21,"男"));
        users.add(new User("杜牧",21,"男"));
        return users;
    }


    @RequestMapping("/isuser/{username}")
    public boolean isuser(@PathVariable("username") String username){
        return "zqw".equals(username);
    }

    @RequestMapping("/login/{username}/{password}")
    public boolean login(@PathVariable("username") String username , @PathVariable("password") String password ){
        return "zqw".equals(username)&&"12345".equals(password);
    }
}
