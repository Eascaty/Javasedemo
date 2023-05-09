package com.home.array;

import java.util.Random;

/**
 * @author: Zhaoxl
 * @date: 2023/5/10 0:18
 * @description:
 */
public class Arraytest9 {
    public static void main(String[] args) {

//        需求：定义一个数组，存入1~5，要求打乱数组中所有数据的顺序


        /*int[] arr = {1,2,3,4,5};
//        索引范围： 01234
        Random r = new Random();
        int randomindex = r.nextInt(arr.length);
        System.out.println(randomindex);*/

        int [] arr ={1,2,3,4,5};
//        循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
//            生成一个随即索引
            int nextInt = r.nextInt(arr.length);
//      拿着随机索引指向的元素 跟 i 指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[nextInt];
            arr[nextInt] = temp;
        }
//        当循环结束后，那么数组中的所有数据已经大乱顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }



    }
}