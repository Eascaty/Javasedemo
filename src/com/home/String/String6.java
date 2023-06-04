package com.home.String;

/**
 * @author: Zhaoxl
 * @date: 2023/6/4 22:09
 * @description:
 */
public class String6 {
    public static void main(String[] args) {
        String result = reverser("abc");
        System.out.println(result);
    }
//        字符串的反转实现

    public static String reverser(String str){
//    abc
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
//                i 依次表示字符串中的没一个索引
            char c =str.charAt(i);
            result = result + c ;
        }

        return result;
    }
}