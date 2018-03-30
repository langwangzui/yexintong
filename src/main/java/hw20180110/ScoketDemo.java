/**
 * Project Name:dt59homework
 * File Name:ScoketDemo.java
 * Package Name:hw20180110
 * Date:2018年1月10日下午6:40:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180110;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午6:40:49 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class ScoketDemo {
    public static void main(String[] args) {
        Socket socket = null;
        java.io.OutputStream outputStream = null;
        try {
            socket = new Socket("192.168.43.46", 10000);
            outputStream = socket.getOutputStream();
            String string = "E:\\安装包\\java笔记\\java笔记整理.txt";
            File file = new File(string);

            BufferedReader bf = new BufferedReader(new FileReader(file));
            String len = null;
            while ((len = bf.readLine()) != null) {
                outputStream.write(len.getBytes());

            }

            // outputStream.flush();
        } catch (UnknownHostException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }finally{
            try {
                outputStream.close();
            } catch (IOException e) {
                
                //  Auto-generated catch block
                e.printStackTrace();
                
            }
        }
    }
}
