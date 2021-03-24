package com.zqw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestfulController {
//   原来的方式：http://localhost:8083/add?a=1&b=80
//    restful:http://localhost:8083/add/a/b
    @RequestMapping("/add")
    public String add1(int a, int b, Model model){
        int res = a+b;
        model.addAttribute("msg","结果是："+res);
        return "hello";
    }
    @RequestMapping("/add/{a}/{b}")
    public String add2(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","结果是："+res);
        return "hello";
    }
}
