package com.home;

import java.util.Random;

/**
 * @author: Zhaoxl
 * @date: 2023/5/14 15:27
 * @description:
 */
public class yanzhengma {
    public static void main(String[] args) {
/*        需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字

        分析:随机抽取数据,可以放到数组里,然后再抽取索引
            char[] chs  = {'a','a','a','a'};*/
            
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
//            ASCII码表
            if(i <=25){
//                小写字母
                chs[i] = (char)(97 + i);
            }else{
//                大写字母;
                chs[i] = (char)(65+ i -26);
            }
        }
//      随机抽取四次,抽取数组中的索引
        String result = "";
            Random r = new Random();
            for (int j = 0; j < 4; j++) {
                int randomindex = r.nextInt(chs.length);
//           利用随机索引获取对应元素
//                System.out.println(chs[randomindex]);
                result = result + chs[randomindex];
            }



//            3.随机抽取一个数字0~9
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);







    }
}