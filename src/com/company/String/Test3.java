package com.company.String;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/12 14:50
 * @Modified By：
 */
public class Test3 {
    public static void main(String[] args) {
        String s1 ="abc";
        byte[] bys =s1.getBytes();
        for (int i = 0 ; i < bys.length;i++){
            System.out.println(bys[i]);
        }
        System.out.println("--------");

        char[] chs = s1.toCharArray();
        for(int i = 0 ; i <chs.length;i++){
            System.out.println(chs[i]);

        }
        System.out.println("----------");

//将指定类型数据转换成字符串
        String s2 = String.valueOf(123);
        System.out.println(s2+4);
//    在实际开发中，上述方式基本会用下边代码
        String s3 = " "+123;
        System.out.println(s3 +4);

//        替换
        String s4 = "abc abc";
        String s5  = s4.replace('b','d');
        System.out.println("s5:"+s5);

    }


}
