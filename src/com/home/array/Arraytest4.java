package com.home.array;

import java.util.Random;

/**
 * @author: Zhaoxl
 * @date: 2023/2/13 23:26
 * @description:
 */
public class Arraytest4 {
    public static void main(String[] args) {

        /*需求：生成10个1-100之间的随机数
        * 1.求出所有数据的和
        * 2.求所有数据的平均数
        * 3.统计有多少个数据比平均值少
        **/

//        分析：1.定义数组
        int[]arr = new int [10];
        int []arr2 = new int[10];
//        2.吧随机数放入数组
Random r =new Random();
        for (int i = 0; i < arr.length ; i++) {
        int number =    r.nextInt(100)+ 1;
            arr[i]= number;
        }


//        遍历数组
        for(int i=0 ;i< arr.length;i++){
            System.out.println(arr[i]);
        }

//        1.求出所有数据的和
        int sum = 0;
        for (int i =0; i <arr.length ; i++) {
            sum = sum +arr[i];
        }

//        2.求所有数据的平均数
        int avg = sum/arr.length;
        System.out.println("数组中的平均数为："+avg);

//        3.统计有多少个数据比平均值小
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count ++;
            }
        }
        System.out.println("在数组中一共有"+count + "个数据比平均值小");


    }
}