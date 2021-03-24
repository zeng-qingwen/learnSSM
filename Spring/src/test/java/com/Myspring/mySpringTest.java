package com.Myspring;

import com.MySpring.Dao.UserDao;
import com.MySpring.Service.UserService;
import com.MySpring.Springcode.MyClassPathXmlApplicationContext;
import org.junit.Test;


public class mySpringTest {
    @Test
    public void myspringtest(){
        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("MySpring/MySpring.xml");

//        创建的是一个单例每个相同类型的类都是同一个类
        UserService userService = (UserService) ac.getbean("userService");
        UserService userService2 = (UserService) ac.getbean("userService");
        UserDao userDao = (UserDao) ac.getbean("userDao");
        UserDao userDao2 = (UserDao) ac.getbean("userDao");
//        测试方法有用
        userService.test();
        userDao.test();

//        检查发现实例类相同
        System.out.println();
        System.out.println(userDao);
        System.out.println(userDao2);
        System.out.println(userDao2==userDao);

        System.out.println();
        System.out.println(userService);
        System.out.println(userService2);
        System.out.println(userService==userService2);


    }

}
