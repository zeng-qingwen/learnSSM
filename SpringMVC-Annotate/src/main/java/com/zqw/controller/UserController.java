package com.zqw.controller;

import com.zqw.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 这个例子演示了用来传递参数的案例
 */
@Controller
public class UserController {
    /**
     * 从前端接受的是基本类型参数
     * 增加了@RequestParam("name")注解，则必须传递name参数，否则会报400错误的请求
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/t1")
    public String test1(@RequestParam("name") String name, Model model){
        System.out.println("收到的参数为:"+name);
        model.addAttribute("msg",name);
        return "hello";
    }


    /**
     *
     * 从前端接受到的是一个对象
     * user对象 属性为id mane  age
     *url为： http://localhost:8083/t2?id=1&mane=tom&age=20
     * 方法名的接受参数为User对象，但是传递的时候必须要传递和属性名一样的参数，如果不一样则该属性为null
     * @param model
     * @return
     */
    @RequestMapping("/t2")
    public String test2(User user, Model model){
        model.addAttribute("msg","hello<br/>"+user);
        System.out.println(user);
        return "hello";
    }

}
