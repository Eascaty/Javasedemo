package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/1/26 23:30
 * @description:
 */
public class Arraytest1 {
    public static void main(String[] args) {
//        定义一个数组，存储1，2，3，4，5
//        遍历数组得到每一个元素，求数组里的所有数据和

//        定义一个数组，并添加数据
        int[] arr  ={1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}