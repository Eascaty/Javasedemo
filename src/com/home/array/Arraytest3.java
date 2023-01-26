package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/1/26 23:51
 * @description:
 */
public class Arraytest3 {
    public static void main(String[] args) {
        /*定义一个数组，存储12345678910
        * 遍历数组得到每一个元素
        * 要求
        * 1.如果是奇数，则将当前数字扩大到原先两倍
        * 2.如果是偶数，则将原先数组变为二分之一*/
        int count= 0 ;
        int [] arr  = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] % 2 == 0) {

                arr[i]=arr[i]/2;
            } else  {
                arr[i]=arr[i]*2;
            }

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}