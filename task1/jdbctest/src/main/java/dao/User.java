package dao;

import javax.swing.*;

public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String location;

    public User(int id,String name,int age,String sex,String location){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.location=location;
    }
    public User(String name,int age,String sex,String location){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.location=location;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
