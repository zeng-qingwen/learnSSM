package com.zqw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {

    @RequestMapping("/getform")
    public String getForm(){
        return "form";
    }

    @PostMapping("/t3")
    public String test3(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hello";
    }

}
