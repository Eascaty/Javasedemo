package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/1/27 15:15
 * @description:
 */
public class Arraydemo4 {
    public static void main(String[] args) {
        /*
         * 定义一个数组，用来存放班级中50个学生的姓名
         * 姓名未知，等学生报道之后，在进行添加*/

//        格式 数据类型[] 数组名 = new 数据类型 [数组的长度];
//        在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值

        String[] arr = new String[50];
        arr[0] = "张三";
        arr[1] = "里斯";
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);



    }
}