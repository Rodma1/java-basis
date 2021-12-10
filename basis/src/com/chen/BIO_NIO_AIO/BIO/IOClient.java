package com.chen.BIO_NIO_AIO.BIO;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * 客户端
 */
public class IOClient {

    public static void main(String[] args) {
        //    创建多个线程，模拟多个客户端连接服务端
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
