package com.company.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/16 13:46
 * @Modified By：
 */
public class ReaderDemo1 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("lib/1.txt");

/*        int ch1 = reader.read();
        System.out.println(ch1);
        int ch2 = reader.read();
        System.out.println(ch2);
        int ch3 = reader.read();
        System.out.println(ch3);
        int ch4 = reader.read();
        System.out.println(ch4);*/
//        定义变量，用来接收读取到的字符

//        （Ch=reader.read() != -1 做了三件事情
//        1.执行reader.read()     去文件中读取一个字符
//        2.执行ch=reader.read(）  将读取到的字符赋值给变量
//        3.(ch=reader.read()!=-1)  用读取到的字符（内容）和-1进行比较

        int ch ;
        while(reader.read() !=-1){
            ch=reader.read();
            System.out.println(ch);
        }

        reader.close();

    }
}
