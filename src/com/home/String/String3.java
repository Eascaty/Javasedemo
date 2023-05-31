package com.home.String;

import java.util.Scanner;

/**
 * @author: Zhaoxl
 * @date: 2023/5/31 23:43
 * @description:
 */
public class String3 {
    public static void main(String[] args) {
//        已知正确的用户名和密码，请用程序实现模拟用户登录

//        定义两个变量记录正确的用户名和密码
                String rightUsername = "zhangsan" ;
                String rightPassword = "123456" ;

//                键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码");
            String username = sc.next();
            System.out.println("请输入用户名");
            String password =sc.next();

//        比较

            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登录成功");
                break;
            } else  {
                System.out.println("用户登录失败,你还剩下" + (2-i) +"次机会");
            }
        }

    }
}