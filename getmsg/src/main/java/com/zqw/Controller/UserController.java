package com.zqw.Controller;

import com.zqw.Dao.UserMapperIml;
import com.zqw.Pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/hello")
    public String test1(Model model){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapperIml userMapperIml = ac.getBean("usermapper",UserMapperIml.class);
        List<User> users = userMapperIml.findAll();
        model.addAttribute("msg",users);
        return "hello";
    }

    @RequestMapping("/getinfo")
    public String test2(String name,String sex,String hobby,Model model){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapperIml userMapperIml = ac.getBean("usermapper",UserMapperIml.class);
        User user = new User(name,sex,hobby);
        userMapperIml.insertUser(user);
        System.out.println(user);
        model.addAttribute("msg","收到信息<br/>"+user);
        return "hello";
    }
}
