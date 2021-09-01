package com.company.mynet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //    socket(IneAddress address,int port)创建流套接字并将其连接到指定IP地址的指定端口号
        //Socket s = new Socket(InetAddress.getByName("127.0.0.1"),10000);
    //    Socket(String host,int port)创建流套接字并将其连接到指定主机上的指定端口号
        Socket s  = new Socket("127.0.0.1",10000);

    //    获取输出流，写数据
    //    outputstream getoutputstream() 返回此套接字的输出流
        OutputStream os =s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
    //    接受服务器反馈
        InputStream is =s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端:"+data);

    //    释放资源
        s.close();
    }
}
