package com.bupt.lianxi.tcpTest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by zhzy on 2017/5/22.
 */

public class tcp_Test {

    public static void main(String[] args) throws IOException{
        // 客户端请求与本机在20006端口建立TCP连接
        Socket client = new Socket("127.0.0.1", 20006);
        client.setSoTimeout(10000);

        //获取键盘输入
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //获取Socket的输出流，用来发送数据到服务端
        PrintStream out = new PrintStream(client.getOutputStream());
        //获取Socket的输入流，用来接收从服务端发来的数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        boolean flag = true;
        while (flag){
            System.out.print("输入信息：");
            String str = input.readLine();
            //发送数据到服务端
            out.println(str);
            if("bye".equals(str)){
                flag = false;
            }else {
                try {
                    //从服务器接收数据有个时间限制(系统自设，也可以自己设置)，超过了这个时间，便会抛出异常
                    String echo = bufferedReader.readLine();
                    System.out.println(echo);
                }catch (SocketTimeoutException e){
                    e.printStackTrace();
                }
            }
        }
        input .close();
        if(client != null){
            client.close();
        }
    }
}
