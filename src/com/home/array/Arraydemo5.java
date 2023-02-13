package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/2/13 23:11
 * @description:
 */
public class Arraydemo5 {
    public static void main(String[] args) {

//        定义数组用来存储5个值
        int[] arr = {33, 5, 22, 44, 55};
//            求数组最大值
//        临时认为0索引的数据是最大的
        int max = arr[0];
//        循环每一个元素，跟max进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
//        当循环结束后，max记录的就是最大值
        System.out.println(max);


//       求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
//max的初始化值一定要是数组中的值











    }
}