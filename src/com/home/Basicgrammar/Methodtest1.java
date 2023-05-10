package com.home.Basicgrammar;

/**
 * @author: Zhaoxl
 * @date: 2023/5/10 21:42
 * @description:
 */
public class Methodtest1 {
    /*需求输出
     * 11，22，33，44，55
     * */
    public static void main(String[] args) {
//    1.定义数组

        int[] arr = {11, 22, 33, 44, 55};
//        2.调用方法遍历数组
        printArr(arr);
    }

    //    定义方法用于数组的遍历
//    1.我要干嘛？ 遍历数组
//    2.我干这件事情需要什么才能完成? 数组
//    3.方法的调用是否需要继续使用结果? 不需要返回值
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i]+ ",");

            if (i  == arr.length -1){
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]+ ",");
            }

        }


        System.out.print("]");
    }
}
