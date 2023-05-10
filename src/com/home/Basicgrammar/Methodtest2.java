package com.home.Basicgrammar;

/**
 * @author: Zhaoxl
 * @date: 2023/5/10 21:54
 * @description:
 */
public class Methodtest2 {
    public static void main(String[] args) {

        int [] arr = {11, 22, 31, 412, 22};

        int max = getMax2(arr);
        System.out.println(max);
    }

    public static int getMax2(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}