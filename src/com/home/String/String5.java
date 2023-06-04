package com.home.String;

/**
 * @author: Zhaoxl
 * @date: 2023/6/1 0:09
 * @description:
 */
public class String5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = arrToString(arr);
        System.out.println(str);
    }
//    我要干嘛？  遍历数组并把数组拼接成一个字符串
//    我干这件事情需要什么才能完成？ 数组
//    我干完了是否要把结果返回给调用处  返回一个拼接之后的字符串

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            // i 索引  arr[i]

            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;


    }


}
