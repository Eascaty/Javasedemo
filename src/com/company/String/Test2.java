package com.company.String;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/12 14:36
 * @Modified By：
 */
public class Test2
{
    public static void main(String[] args) {
        String str = "java 黑马程序员 java";
        int  length= str.length();
        System.out.println(length);

        char ch  = str.charAt(1);
        System.out.println(ch);

        int  index1 = str.indexOf('a');
        System.out.println("index1:"+index1);

        int index2 = str.lastIndexOf('a');
        System.out.println("index2:"+index2);

        String s1= str.substring(5);
        System.out.println("s1:"+s1);

//        substring(int,int):     获取从索引start位置（含）起至索引end位置（不含）的字符串
        String s2= str.substring(5,10);
        System.out.println("s2:"+s2);
    }
}
