package com.home.String;

import static javafx.beans.binding.Bindings.when;

/**
 * @author: Zhaoxl
 * @date: 2023/5/14 17:12
 * @description:
 */
public class String1 {
    public static void main(String[] args) {

//        直接赋值来获取字符串对线
        String s1= "abc";
        System.out.println(s1);

//        使用new的方式来获取一个字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

//        传递一个字符串,根据传递的字符串内容再创建一个字符串对线
        String s3 = new String("abc");
        System.out.println(s3);


//        传递一个字符数组,根据字符数组的内容再创建一个字符串对象
//          需求:我需要修改字符串的neritic
//        abc --> {'a','b','c'} --> {'q','b','c'}
        char[] chs = {'a','b','c'};
        String s4 = new String(chs);
        System.out.println(s4);


/*传递一个字节数组,根据字节数组的内容再创建一个新的字符串对象
* 应用场景:以后在网络当中传输的数据其实都是字节信息
* 我们一般要把字节信息进行转换,转成字符串,此时就要用到这个构造了*/

        byte[] bytes = {97,98,99};
                String s5 = new String(bytes);
        System.out.println(s5);

        int sum = 0;
        for(int i=0;i<10;++i,sum+=i){

            while(i==9||i==10){

                System.out.println("i="+i+"sum="+sum);

            }
        } System.out.print(sum);
    }
}