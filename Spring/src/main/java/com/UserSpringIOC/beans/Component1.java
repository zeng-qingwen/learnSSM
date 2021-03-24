package com.UserSpringIOC.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @Component注解放在指定的类前面,声明这个类有Spring管理了,将类注册在Spring中
 * 一下面三个都和@Component的功能一样,但是在不同的层中使用
 * @Repository  在Dao层使用
 * @Service     在Serve层使用
 * @Controller  在Controller使用
 *
 *
 * @Scope用来指定在Spring中类的创建类型是什么
 */

@Component
@Scope
public class Component1 {
    /**
     *@Value("zqw")注解注入值到指定的属性上面
     */
    @Value("zqw")
    public String name;
}
