package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/5/9 22:04
 * @description:
 */
public class Arraytest7 {
    public static void main(String[] args) {

//        定义一个数组，存入12345，交换首尾索引对应的元素

        int[] arr = {1, 2, 3, 4, 5};
//        利用循环去交换数据
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//                交换变量i和j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//            当循环结束后，数组中的数据就实现了头尾交换

        for (int i = 0 ; i< arr.length ; i++){
            System.out.println(arr[i] + "");
        }
    }
}