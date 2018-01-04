/**
 * Project Name:dt59homework
 * File Name:StringDome.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:17:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:17:46 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class StringDemo {
    
    /*String对象的属性和方法
     * 
     * 属性:
     * 1.length
     * 2、constructor 属性
     * 3、prototype 属性
     * 方法:
     * 1、toCharArray()replace()
     * 2、length()字符串长度
     * 3、charAt()从字符串中取出指定位置的字符
     * 4、indexOf()过滤字符串中存在的字符
     * 5、replace()替换String字符串中的一个字符
     * 6、toString()返回此对象本身
     */
    private final static Logger LOG=Logger.getLogger(StringDemo.class);
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LOG.info("\n请输入字符串");
        String str=scanner.next();
        /*方法1 字符串长度：length的用法*/
        LOG.info("\n字符串为:"+str);
        LOG.info("\n字符串的长度为:"+str.length());
        /*方法2 字符串转换数组：toCharArray()的用法*/
        LOG.info("\n将字符串转换数组");
        char data[]=str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            LOG.info("\n挨个输出"+"\t"+data[i]);
        }
        LOG.info("\n请输入下标");
        int num1=scanner.nextInt();
        LOG.info("\n用下标提取:"+data[num1]);
        /*方法3 从字符串中取出指定位置的字符：charAt()*/
        LOG.info("\n请输入合理的数字");
        int num2=scanner.nextInt();
        LOG.info("\n指定位置的字符为:"+str.charAt(num2));
        scanner.close();
        /*方法4 过滤字符串中存在的字符：indexOf()*/
        LOG.info("\n过滤字符串中存在的字符@.163");
        String str1="jikexueyuan@.163.com";
        LOG.info("\n"+str1);
        LOG.info("\n"+str1.indexOf("@.163"));
        /*方法5 替换String字符串中的一个字符：replace()*/
        LOG.info("\n"+str1);
        LOG.info("\n"+str1.replace("163", "qq"));
    }

}

