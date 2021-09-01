package com.company.xunhuan;/**
  * @Description:
  * @Author: xuchen
  * @Date: 2021/7/12 16:01
  * @Modified By：
  */public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr ={2,3,6,7,9,11};

        printArray(arr);




    }

    private static void printArray(int[] arr) {
        for(int i = 0  ;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}
