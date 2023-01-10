package com.home.BasicConcept;


/**
 * 数据存储过程
 */
public class valuedemo2bus {
    public static void main(String[] args) {
        //二进制 逢二进一
//         十进制跟二进制  0-0  1-1 2-10  3-11 4-100

//代码中
        System.out.println(17);//十进制
        System.out.println(017);//八进制
//        System.out.println(0b123);//语法错误
        System.out.println(0b11);//二进制
        System.out.println(0x123);//十六进制

//        计算机为什么用二进制， 1958年的计算机都是打孔的，以有孔和没孔来区分。

//        任意进制转十进制  公式：系数*基数的权次幂 相加
//        101 二进制
//               十进制 1*2^2  + 0*2^1+ 1*2^0 = 5

//    101 八进制
//        十进制 1*8^2 + 0*8^1 + 1*8^0 =65


//        十进制转其他进制    除基取余法
//        不断的除以基数（几进制，基数就是几）得到余数，直到商为0，再将余数倒着拼起来即可

//        图片声音文本都是以二进制来还原
//        在计算机中，任意数据都是以二进制来存储
//        图片：通过每一个像素点中的RGB三原色来存储
//        声音：对声音的波形图进行采样再存储
//        Text文本：数字转二进制，字母查询码表，汉字查询码表









    }
}
