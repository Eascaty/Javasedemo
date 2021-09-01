package com.company.mynet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
    // 创建发送端的socket对象
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String line ;
        while ((line=br.readLine())!=null){
        //    输入的数据是886，发送数据结束
            if("886".equals(line)){
                break;
            }
            //    创建数据
                byte[] bys  = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("127.0.0.1"),12345);



            //    调用Datagramsocket对象的方法发送数据
            ds.send(dp);




        }


    //    关闭发送端
        ds.close();
    }
}
