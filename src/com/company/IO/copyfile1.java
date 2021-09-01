package com.company.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/16 14:38
 * @Modified By：
 */
public class copyfile1 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("lib/1.txt");

        FileWriter fw = new FileWriter("lib/2..txt");

        char[] chs = new char[1024];

        int len;
        while((len = fr.read(chs))!=-1){
            fw.write(chs,0,len);

        }
        fr.close();
        fw.close();

    }
}
