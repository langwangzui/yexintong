/**
 * Project Name:dt59homework
 * File Name:Copy.java
 * Package Name:hw20180107
 * Date:2018年1月6日下午6:05:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午6:05:48 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class Copy {
    public static void copy(FileReader fileReader,FileWriter fileWriter) throws IOException{
        char b []=new char[1024];
        int len=fileReader.read(b);
        while (len!=-1) {
            StringBuffer stringBuffer=new StringBuffer(new String(b,0,len));
            fileWriter.write(stringBuffer.toString());
            //System.out.println(stringBuffer.toString());
            len=fileReader.read(b);
        }
    }
    public static void main(String[] args) throws IOException {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader=new FileReader("E:\\安装包\\java笔记\\java笔记整理.txt");
            fileWriter=new FileWriter("E:\\安装包\\java笔记\\java笔记整理copy.txt");
            copy(fileReader, fileWriter);
        }
       catch (IOException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }finally {
            if (fileReader != null) {

                fileReader.close();
            }
            if (fileWriter != null) {

                fileWriter.close();

            }
        }

    }
}
