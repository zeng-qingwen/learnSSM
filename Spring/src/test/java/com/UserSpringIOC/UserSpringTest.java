package com.UserSpringIOC;

import com.UserSpringIOC.Dao.UserDao;
import com.UserSpringIOC.Service.UserService;
import com.UserSpringIOC.Control.UserControl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSpringTest {
    @Test
    public  void UserSpringtest(){
//        1.通过类路径获取ApplicationContext对象的实例,全单xml文件的导入方法
//        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");

//        2.通过文件绝对路径获取ApplicationContext对象的实例，全单xml文件的导入方法
//        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\javaCode\\MavenItems\\Spring\\src\\main\\resources\\UserSpringIOC\\Spring.xml");

//        3.多xml配置文件中可以通过类路径的方法来传入多个xml文件
//        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Dao.xml","UserSpringIOC/Service.xml","UserSpringIOC/Control.xml");

//        4.多xml配置文件也可以通过在一个xml中使用import标签引入其他的xml文件，然后再引入这xml文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");


//       获取类实例
        UserDao userDao =(UserDao) ac.getBean("userDao");
        UserService userService = (UserService) ac.getBean("userServer");
        UserControl userControl = (UserControl) ac.getBean("userControl");

//        调用方法
        userDao.say();
        userService.say();
        userControl.say();

    }
}
