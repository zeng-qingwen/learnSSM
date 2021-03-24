package com.SpringAOP;

import com.SpringAOP.AOP.UserService;
import com.SpringAOP.AOP.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAOPTest {
    @Test
    public void UserServiceImplTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringAOP/Spring.xml");

//        动态代理的是接口
        UserService userService = (UserService) ac.getBean("userService");

        userService.add();
    }
}
