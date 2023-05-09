package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/5/9 21:29
 * @description:
 */
public class Arraytest6 {
    public static void main(String[] args) {
//    需求： 定义两个变量，交换两个变量记录的值
             int a = 10 ;
             int b = 20;
             a = b;
             b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("---");
//        需要中间变量
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}