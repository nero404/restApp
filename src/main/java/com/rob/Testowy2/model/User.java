package com.rob.Testowy2.model;

public class User {
    long id;
    String name;
    int age;


   public  User(){}

    public User(long id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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



}