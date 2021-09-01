package com.company.IO;

import java.io.*;
import java.util.Scanner;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/16 15:35
 * @Modified By：
 */
public class uploadfile {
    public static void main(String[] args) throws IOException {

        File path =getPath();
        System.out.println(path);
        boolean flag = isExists(path.getName());
if (flag){
    System.out.println("该用户头像已经存在，上传失败");
}else{
uploadFile(path);
}

//    3.如果存在，提示：该用户头像已经存在，上传失败
//    4.如果不存在，就上传该用户头像，并提示上传成功


    }
    //    1.定义一个方法，用来获取要上传的用户头像的路径 getPath();
        public static File getPath(){
//        提示用户录入  要上传的用户头像路径，并接受
            Scanner sc = new Scanner(System.in);
            while(true){
            System.out.println("请录入您要上传的用户头像的路径：");
            String path = sc.nextLine();
//            判断该路径的后缀名是否是: .jpg .png .bmp

//            如果不是，就提示:你录入的不是图片，请重新录入；
            if(!path.endsWith(".jpg")&&!path.endsWith(".png")&& !path.endsWith("bmp")){
                System.out.println("您录入的不是图片，请重新录入：");
            continue;
            }
//            如果是，程序接着执行，判断该路径是否存在，并且是否是文件
            File file = new File(path);
            if(file.exists()&& file.isFile()){
                return file;
            }else{
//                  如果不是，就提示：您录入的路径不合法，请重新录入；
                System.out.println("您录入的路径不合法，请重新录入:");
            }
//

//            如果是，说明就是我们想要的数据，直接放

//            因为不知道用户多少次能录入正确，所以用while(true)改进

        }
    }
    //    2.定义一个方法，用来判断要上传的用户头像，在Lib文件夹中是否存在
    public static boolean isExists(String path){
//
        File file = new File("lib");
        String[] names =file.list();
        for (String name : names) {
            if(name.equals(path)){
                return true;
            }
        }
        return  false;
    }
//    用来上传具体的用户头像
//    path 数据源文件的路径
    public static void uploadFile(File path) throws IOException {
//        1.创建字节输入流，关联数据源文件
//        public FileInputStream(File file)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));  //path : d:\picture\1.png
//        2.创建字节输出流，关联目的地文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/"+path.getName()));  //  lib/1.png
//        3，定义变量，记录读取到的数据
        int len;
//        4.循环读取，只要条件满足就一直读
        while((len=bis.read()) !=1){
            bos.write(len);
        }
//        5.将读取到的数据写入到目的地的文件中
        bis.close();
        bos.close();
//        6.释放资源
        System.out.println("上传成功");

    }


}
