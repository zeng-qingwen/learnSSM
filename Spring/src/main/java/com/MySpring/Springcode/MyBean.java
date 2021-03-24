package com.MySpring.Springcode;

/**
 * bean标签属性对象
 * 用来存放配置文件中的id和class属性值
 */
public class MyBean {


    private String id;
    private String clazz;


//    构造方法
    public MyBean() {
    }

    public MyBean(String id, String clazz) {
        this.id = id;
        this.clazz = clazz;
    }

//    get和set方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getClazz() {
        return clazz;
    }


//    toString方法
    @Override
    public String toString() {
        return "bean{" +
                "id='" + id + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
