package com.zqw.Pojo;

public class User {
    private String name;
    private int age;
    private String sex;
    private String account;
    private String password;

    public User(String name, int age, String sex, String account, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.account = account;
        this.password = password;
    }

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
