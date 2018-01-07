/**
 * Project Name:dt59homework
 * File Name:TestFile.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午1:59:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午1:59:43 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class TestFile {
    // public static void testFile(File file1){
    // File[]file2=file1.listFiles();
    // for(int i=0;i<file2.length;i++){
    // if(file2[i].isDirectory()){
    // testFile(file2[i]);
    // }else{
    // LOG.info(file2[i]);
    // }
    // }
    // }
    public static void testFile(String str) {
        File file = new File(str);
        File[] file2 = file.listFiles();
        for (int i = 0; i < file2.length; i++) {
            if (file2[i].isDirectory()) {
                testFile(file2[i].toString());            
            } else {
                LOG.info(file2[i]);
            }
        }
    }

    private final static Logger LOG = Logger.getLogger(TestFile.class);

    public static void main(String[] args) {
        String str = "E:\\安装包";
        testFile(str);
        // File file1=new File("E:\\安装包");
        // testFile(file1);
    }

}
