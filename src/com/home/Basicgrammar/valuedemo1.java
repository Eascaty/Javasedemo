package com.home.Basicgrammar;


import java.util.Scanner;

/**
 * 字面量
 */
public class valuedemo1 {
    //        关键字全部小写
    public static void main(String[] args) {

//        字符串类型带双引号
//        "helloworld","黑马程序员"

//    字符类型
//      'A','B','C','D','E','F','我'
//
//      整数输出
        System.out.println(666);
        System.out.println(-777);

//        小数
        System.out.println(1.93);
        System.out.println(-3.71);

//        字符串
        System.out.println("黑马程序员");
        System.out.println("我是大帅哥");

//    字符
        System.out.println('男');
        System.out.println('女');

//        布尔
        System.out.println(true);
        System.out.println(false);

//        空
//        细节：null是不能直接打印的
//        只能用字符串的方式打印出Null
        System.out.println("null");


//        '\t'制表符
//        在打印的时候，把前面字符串的长度补齐到8或者是8的倍数。最少补一个空格，最多补8个空格
        System.out.println("tom23"+'\t'+ "age");

        int a = 10 ;
        System.out.println(a);//10

//        float类型变量
        float  f = 20F;
        System.out.println("F"+f);

//        手机价格
        double price =5299.0;
        String name = "华为";
        System.out.println(price+name);
/*
*  标识符  由数字、字母、下划线和美元符组成
* 不能以数字开头
* 不能是关键字
* 区分大小写*/

/*键盘录入*/
        System.out.println("键盘录入test");
        Scanner sc =new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);

    }





}
