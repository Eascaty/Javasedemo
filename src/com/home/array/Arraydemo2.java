package com.home.array;

public class Arraydemo2 {
    public static void main(String[] args) {
        //    利用索引对数组中的元素进行访问
//    1.获取数组里的元素


        int[]arr = {1,23,4};
//    获取数组中的第一个元素
        int number = arr[0];
        System.out.println(number);
        System.out.println(arr[1]);
//    2.把数据存储在数组当中
//      细节： 一旦覆盖后，原来的数据就不存在了
        arr[0]  = 100;
        System.out.println(arr[0]);




    }

}
