package com.home.String;

import java.util.Scanner;

/**
 * @author: Zhaoxl
 * @date: 2023/5/31 23:52
 * @description:
 */
public class String4 {
    public static void main(String[] args) {
        String a = "";
        for (int i = 0; i < 3; i++) {
            a += "s";
        }

        System.out.println(a);

//        遍历字符串
        String str2 = "abcd";
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            System.out.println(c);
        }

//        统计字符串的，大写、小写、数s字的出现次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
//        统计次数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;

            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }

        }
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("数字字母有：" + numberCount + "个");

    }


}


