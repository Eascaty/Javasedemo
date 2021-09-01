package com.company.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/16 14:21
 * @Modified By：
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
//        1.创建字符输出流对象
        Writer writer = new FileWriter("lib/1.txt");
//        2，写数据
//        一次写一个字符
        writer.write('好');

//        一次写一个指定的字符数组
        char[] chs = {'嘿','嘛','测','陈'};
        writer.write(chs,2,1);

//        一次写一个字符串
        writer.write("知识改变命运");


//        3，释放资源
        writer.close();
    }
}
