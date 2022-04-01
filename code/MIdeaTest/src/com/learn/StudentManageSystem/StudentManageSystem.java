package com.learn.StudentManageSystem;

import com.learn.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {
    private int size;
    private ArrayList<String> idList = new ArrayList<>();
    private ArrayList<Student> stuArr = new ArrayList<>();

    public StudentManageSystem(int size, ArrayList<Student> stuArr) {
        this.size = size;
        this.stuArr = stuArr;
    }

    public StudentManageSystem(int size) {
        this.size = size;
    }

    public StudentManageSystem(ArrayList<Student> stuArr) {
        this.stuArr = stuArr;
    }

    public StudentManageSystem() {
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Student> getStuArr() {
        return stuArr;
    }

//    添加学生，返回添加结果
    public void CreateStudent(Student stu) {
        this.stuArr.add(stu);
        this.idList.add(stu.getId());
        this.size++;
    }

//    删除学生，返回该学生对象
    public Student DeleteStudent(String id) {
        for (int i = 0; i < this.stuArr.size(); i++) {
            Student temp = this.stuArr.get(i);
            if (temp.getId().equals(id)) {
                this.stuArr.remove(i);
                this.idList.remove(temp.getId());
                this.size--;
                return temp;
            }
        }
        return null;
    }

//    修改学生信息，返回修改结果
    public boolean UpdateStudent(Student stu, String id) {
        if (!stu.getId().equals(id))
            return false;
        for (int i = 0; i < this.stuArr.size(); i++) {
            Student temp = this.stuArr.get(i);
            if (temp.getId().equals(id)) {
                this.stuArr.set(i, stu);
                return true;
            }
        }
        return false;
    }

//    查看学生信息，直接打印信息
    public void ResearchStudent(String id) {
        for (Student temp : this.stuArr) {
            if (temp.getId().equals(id)) {
                System.out.println("学号：" + temp.getId());
                System.out.println("年龄：" + temp.getAge());
                System.out.println("姓名：" + temp.getName());
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManageSystem system = new StudentManageSystem();
        boolean flag =true;
        while (flag) {
            systemShow();
            String input = sc.next();
            int inputCase = getInput(input);
            switch (inputCase) {
                case 1 -> StudentInsert(sc, system);
                case 2 -> StudnetDelete(sc, system);
                case 3 -> StudentUpdate(sc, system);
                case 4 -> StudentSearch(sc, system);
                case 5 -> flag = false;
                default -> System.out.println("请输入合法数字");
            }
        }
    }

    private static void StudentSearch(Scanner sc, StudentManageSystem system) {
        if (system.size==0)
            System.out.println("学生数据为空，请先添加学生");
        else {
            System.out.println("查询全部学生，请输入-1，查询单个学生，请输入学号");
            if (sc.next().equals("-1")){
                for (Student temp : system.stuArr) {
                    System.out.println(temp.getId() + "..." + temp.getName() + "..." + temp.getAge());
                }
            } else {
                String id = sc.next();
                while (!idSearch(system, id)) {
                    id = sc.next();
                }
                system.ResearchStudent(id);
            }
        }
    }

    private static void StudentUpdate(Scanner sc, StudentManageSystem system) {
        System.out.println("请输入学号:");
        String id = sc.next();
        while (!idSearch(system, id)) {
            id = sc.next();
        }
        Student stu = new Student(id);
        System.out.println("请输入姓名:");
        stu.setName(sc.next());
        System.out.println("请输入年龄:");
        stu.setAge(sc.nextInt());
        system.UpdateStudent(stu, id);
        System.out.println("修改学生成功");
    }

    private static void StudnetDelete(Scanner sc, StudentManageSystem system) {
        String id = sc.next();
        Student temp = system.DeleteStudent(id);
        if (temp != null) {
            System.out.println("删除成功，学生信息为：" + temp.getId() + "..." + temp.getName() + "..." + temp.getId());
        } else {
            System.out.println("删除失败，请重试");
        }
    }

    private static void StudentInsert(Scanner sc, StudentManageSystem system) {
        System.out.println("请输入学号:");
        String id = sc.next();
        while (!idCheck(system, id)) {
            id = sc.next();
        }
        Student stu = new Student(id);
        System.out.println("请输入姓名:");
        stu.setName(sc.next());
        System.out.println("请输入年龄:");
        stu.setAge(sc.nextInt());
        system.CreateStudent(stu);
        System.out.println("添加学生成功");
    }

    private static boolean idCheck(StudentManageSystem system, String id) {
        if (system.size == 0)
            return true;
        for( String temp : system.idList) {
            if (temp.equals(id)) {
                System.out.println("学号已被占用，请重新输入学号:");
                return false;
            }
        }
        return true;
    }

    private static boolean idSearch(StudentManageSystem system, String id) {
        for( String temp : system.idList) {
            if (temp.equals(id))
                return true;
        }
        System.out.println("学号不存在，请重新输入学号:");
        return false;
    }

    private static int getInput(String input) {
        if (input.equals("1")|| input.equals("2")|| input.equals("3")|| input.equals("4")|| input.equals("5")) {
            return Integer.parseInt(input);
        } else
            return -1;
    }

    private static void systemShow() {
        System.out.println("----------欢迎来到学生管理系统----------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("5.退出");
    }
}
