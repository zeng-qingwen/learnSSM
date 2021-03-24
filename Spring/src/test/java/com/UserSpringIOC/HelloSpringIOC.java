package com.UserSpringIOC;

import com.UserSpringIOC.Control.HelloControl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringIOC {

    @Test
    public void HelloSpringIOC(){
//        获取ac
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");

//        使用ac通过id
        HelloControl helloControl1 = (HelloControl) ac.getBean("HelloControl");
        System.out.println(helloControl1.getHello());
    }
}
