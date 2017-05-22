package com.bupt.lianxi.tcpTest.server;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhzy on 2017/5/22.
 */
public class Server1 {

    public static void main(String[] args) throws Exception{
        //服务端在20006端口坚挺客户端的TCP连接
        ServerSocket serverSocket = new ServerSocket(20006);
        Socket client = null;
        boolean f = true;
        while (f){
            //等待客户端的连接，如果没有获取连接
            client = serverSocket.accept();
            System.out.println("与客户端连接成功");
            new Thread(new ServerThread(client)).start();
        }
        serverSocket.close();
    }
}
