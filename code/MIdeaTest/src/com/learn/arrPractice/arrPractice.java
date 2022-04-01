package com.learn.arrPractice;

import com.learn.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class arrPractice {
    public static void main(String[] args) {
        ArrayList<Student> input = case2();
        ArrayList<Student> output = new ArrayList<>();
        for (Student temp : input) {
            if (temp.getAge() < 18) {
                output.add(temp);
            }
        }
        for (Student student : output) {
            System.out.println(student.getName() + "..." + student.getAge());
        }
    }

    private static void case3() {
        ArrayList<String> input = case1();
        int size = input.size();
        for (int i = 1; i<=size; i++) {
            if (input.get(size-i).equals("111")) {
                input.remove(size-i);
                System.out.println(size-i);
            }
        }
        System.out.println(input);
    }

    private static ArrayList<Student> case2() {
        ArrayList<Student> stuList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student temp = new Student();
            System.out.print("请输入学生姓名: ");
            temp.setName(sc.next());
            System.out.print("请输入学生年龄: ");
            temp.setAge(sc.nextInt());
            stuList.add(temp);
        }

        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i).getName() + "..." + stuList.get(i).getAge());
        }
        return stuList;
    }
    private static ArrayList<String> case1() {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("111");
        strList.add("111");
        strList.add("111");
        strList.add("111");
        strList.add("222");
        strList.add("333");
        strList.add("test");
        strList.add("test");
        strList.add("test");
//        for (int i = 0; i < strList.size(); i++) {
//            System.out.println(strList.get(i));
//        }
        return strList;
    }
}
