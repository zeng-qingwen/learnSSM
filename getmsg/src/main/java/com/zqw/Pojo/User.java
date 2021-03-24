package com.zqw.Pojo;

public class User {

    private int id;
    private String name;
    private String sex;
    private String hobby;

    public User(int id, String name, String sex, String hobby) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    public User(String name, String sex, String hobby) {
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
