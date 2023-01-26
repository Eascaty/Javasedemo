package com.home.array;

/**
 * @author: Zhaoxl
 * @date: 2023/1/26 23:45
 * @description:
 */
public class Arraytest2 {
    public static void main(String[] args) {
/*定义一个数组，存储12345678910
* 遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/
        int count= 0 ;
            int [] arr  = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
//
            if(arr[i]%3 == 0){
                System.out.println(arr[i]);
                count ++;
            }

        }
        System.out.println(count);
    }
}