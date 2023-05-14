package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/5/9 22:25
 * @description:
 */
public class Arraytest8 {
    public static void main(String[] args) {

//复制数组
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

    }}