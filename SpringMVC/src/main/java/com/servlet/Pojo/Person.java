package com.servlet.Pojo;

public class Person {
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
