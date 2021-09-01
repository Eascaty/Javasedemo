package com.company.xunhuan;

import java.util.Scanner;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/8 9:59
 * @Modified By：
 */
public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请录入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个证书");
        int num2 =sc.nextInt();

        boolean is =compare(num1,num2);
        System.out.println(is);
    }

    public static boolean compare(int a,int b) {

        return a==b;
    }



}
