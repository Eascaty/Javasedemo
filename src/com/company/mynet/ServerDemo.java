package com.company.mynet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
    //    创建服务器端的socket对象（ServerSocket)
    //    ServerSocket(int port)创建绑定到指定端口的服务器
        ServerSocket ss = new ServerSocket(10000);

        //    socket accept()侦听要连接到此套接字并接受它
        Socket s = ss.accept();

    //    获取输入流，读数据，并把数据在控制台显示
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器是:"+data);

    //    给出反馈
        OutputStream os =s.getOutputStream();
        os.write("数据已经收到".getBytes());

    //    释放资源
    //    s.close();
        ss.close();



    }
}
