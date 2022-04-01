package com.learn.domain;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
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
        if (age<=0) {
            System.out.println("年龄不能小于0");
            return;
        }
        this.age = age;
    }
}
