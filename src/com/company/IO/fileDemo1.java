package com.company.IO;

import java.io.File;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/15 16:50
 * @Modified By：
 */
public class fileDemo1 {
    public static void main(String[] args) {
                    File file1 = new File("lib/1.txt");

                    String path1 =file1.getAbsolutePath();
                    System.out.println("绝对路径："+path1);

                    String path2 = file1.getPath();
                    System.out.println("相对路径"+path2);

            String file1Name = file1.getName();
            System.out.println("文件名"+file1Name);

//            获取lib文件夹下所有文件夹的，名称数组String[]
                    File file2 = new File("lib");
                    String[] names = file2.list();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------");

//        获取lib文件夹下所有的文件夹的file对象数组 File[]
            File[] files =  file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
