package com.company.String;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/12 14:19
 * @Modified By：
 */
public class Test {
    public static void main(String[] args) {

//        将指定的字节数组转成字符串
        byte[] bys ={97,98,99};
        String s1 =new String(bys);
        System.out.println("s1:"+s1);

//        将指定的字符数组转成字符串
        char[] chs = {'h','e'};
        String s2=new String (chs);
        System.out.println("s2:"+s2);


//        实际开发
        String s3="abc";
        //免new
        System.out.println("s3:"+s3);
        System.out.println("---------");


//        测试成员方法
        String str1="abc";
        String str2="ABC";
        boolean b1 = str1.equals(str2);
        System.out.println("equals():"+b1);

        boolean b2 =  str1.equalsIgnoreCase(str2);
        System.out.println("equalsIgnoreCase():"+b2);

        boolean b3 =str1.startsWith("a");
        System.out.println("startWith():"+b3);
        String str3 = "hello";
        boolean b4 = str3.isEmpty();
        System.out.println("isEmpty():"+b4);

    }
}
