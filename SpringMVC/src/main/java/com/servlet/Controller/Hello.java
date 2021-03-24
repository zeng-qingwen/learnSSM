package com.servlet.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

//        业务代码
        String result = "hello,springMVC";
        modelAndView.addObject("msg",result);
//        跳转试图
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
