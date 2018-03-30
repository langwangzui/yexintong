/**
 * Project Name:dt59homework
 * File Name:SarverScoketDemo.java
 * Package Name:hw20180110
 * Date:2018年1月10日下午6:43:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180110;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午6:43:25 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class ServerScoketDemo {
    public static void main(String[] args) {
        int post = 10000;
        ServerSocket serverScoket = null;
        InputStream inputStream1 = null;
        Socket socket1 = null;
        try {
            serverScoket = new ServerSocket(post);
            socket1 = serverScoket.accept();
//            String ip = socket1.getInetAddress().getHostAddress();
//            System.out.print(ip);
            inputStream1 = socket1.getInputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\安装包\\java笔记\\java笔记整理1.txt"));
            byte[] by = new byte[1024];
            int number = -1;
            //number = inputStream1.read(by);
//            System.out.println(new String(by, 0, number));
            while ((number = inputStream1.read(by)) != -1) {
                String string = new String(by, 0, number);
                bufferedWriter.write(string);
                System.out.println(string);
            }
            bufferedWriter.flush();
        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }
}
