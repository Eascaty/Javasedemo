package com.home.Basicgrammar;

/**
 * @author: Zhaoxl
 * @date: 2023/5/10 21:31
 * @description:
 */
public class MethodOverloading {
    public static void main(String[] args) {

        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法
        * 要求：兼容全整数类型（byte,short,int,long)*/

//        调用
        compare(10,20);
    }
    /*会把相同功能的方法名起成一样的名字
    * 好处1：定义方法的时候可以不用那么多的单词
    * 好处2：调用方法的时候也不需要那么麻烦*/
    public static void compare(byte b1,byte b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(short  s1,short  s2) {
        System.out.println(s1 == s2);
    }
    public static void compare(int i1,int i2) {
        System.out.println(i1 == i2);
    }
    public static void compare(long n1,long n2) {
        System.out.println(n1 == n2);
    }

}