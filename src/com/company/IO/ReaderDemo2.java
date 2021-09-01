package com.company.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/16 14:05
 * @Modified By：
 */
public class ReaderDemo2 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("lib/2..txt");
/*
        char[] chs  =new char[3];
        int len1 = reader.read(chs);
        System.out.println(chs);
        System.out.println(len1);

        int len2 = reader.read(chs);
        System.out.println(chs);
        System.out.println(len2);

        int len3 = reader.read(chs);
        System.out.println(chs);
        System.out.println(len3);*/

        char[] chs = new char[3];
        int len ;
        while( (len = reader.read(chs) )!= -1){
//            将读取到的内容，转换成字符串，然后打印
            /*chs:表示要操作的数组
            * 0：表示起始索引
            * len：表示要操作字符的个数*/
            String s = new String(chs,0,len);
            System.out.println(s);
        }



        reader.close();


    }
}
