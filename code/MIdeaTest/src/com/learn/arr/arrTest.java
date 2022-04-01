package com.learn.arr;

import com.learn.domain.Student;

import java.util.ArrayList;

public class arrTest {
    public static void main(String[] args) {
        Student[] stuArr = new Student[3];
        ArrayList<Student> stuList = new ArrayList<>();
        Student stu1 = new Student("张三", 24);
        Student stu2 = new Student("李四", 25);
        Student stu3 = new Student("王五", 26);

        stuArr[0] = stu1;
        stuArr[1] = stu2;
        stuArr[2] = stu3;

        for (int i=0; i<3; ++i) {
            System.out.println(stuArr[i].getName()+"..."+stuArr[i].getAge());
        }
    }
}
