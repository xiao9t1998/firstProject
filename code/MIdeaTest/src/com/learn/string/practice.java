package com.learn.string;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> db = new Hashtable<>();
        db.put("xiao9t98", "123qweASD");
        System.out.print("请输入用户名: ");
        String username = sc.nextLine();
        while (db.get(username)==null) {
            System.out.println("用户名不存在, 请重新输入");
            username = sc.nextLine();
        }
        for (int i=0 ; i<3; ++i){
            if (i>0){
                System.out.println("密码错误，还有"+(3-i)+"次机会");
            }
            System.out.print("请输入密码:");
            String input = sc.nextLine();
            if (input.equals(db.get(username))){
                System.out.println("登录成功!");
                break;
            }
            if (i==2) {
                System.out.println("今日尝试登录次数已达上限，账户锁定");
            }
        }
    }
}
