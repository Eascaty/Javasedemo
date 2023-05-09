package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/5/9 21:54
 * @description:
 */
public class Arraytest5 {
    public static void main(String[] args) {

//        需求：定义一个数组，将数组中0索引和最大索引处的值进行交换
        int[] arr = {1,2,3,4,5};
//        将数组中0索引和最大索引处的值进行交互
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}