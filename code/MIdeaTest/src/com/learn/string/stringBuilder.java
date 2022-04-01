package com.learn.string;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1122332211");
        sb.append(1);
        System.out.println(sb.length());
        sb.append("abc");
        System.out.println(sb.length());
        sb.append(true);
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuilder test = sb.append(1);
        System.out.println(test);
        System.out.println(sb);
        System.out.println(sb == test);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0,3,"church"));
        System.out.println(sb.toString());
        System.out.println(sb.equals("1abctrue1"));
        System.out.println(sb.toString().getClass().getName());
    }
}
