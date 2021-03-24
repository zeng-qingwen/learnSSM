package com.UserSpringIOC.beans;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * set方法注入：
 * 通过property属性注入
 *      name：bean对象中属性字段的名称
 *      ref：指定bean标签的id属性值
 *      value:常用类型，基本类型，集合可以使用value
 */
@Data
public class SetInject01 {
    private Hello hello;                //    javabean对象的注入
    private String Host;                //    常用对象的注入
    private Integer port;               //    基本类型的注入
    private List<String> list;          //    集合类型list的注入
    private Set<String> set;            //    集合类型set的注入
    private Map<String,Object> map;     //    集合类型map的注入

    public void test(){
        System.out.println(Host+":"+port);
        System.out.println("SetInject01中调用Hello类的test()方法");
        this.hello.test();
    }
}