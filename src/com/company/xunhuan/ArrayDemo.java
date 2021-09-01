package com.company.xunhuan;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/8 10:44
 * @Modified By：
 */
public class ArrayDemo
{
    public static void main(String[] args) {








//        遍历最大元素
       int [] arr  ={1,3,55,2,4,6 };
       int temp =arr[0];
       for(int i = 0; i<arr.length;i++){
           if(arr[i]>temp){
               temp = arr[i];
           }
       }
        System.out.println("数组中的最大元素为："+temp);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        for(int i  = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }





    }
}
