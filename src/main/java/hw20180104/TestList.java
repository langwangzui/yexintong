/**
 * Project Name:dt59homework
 * File Name:TestList.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:44:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:44:55 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class TestList {
    /**
     * List 做练习：添加、修改、删除 、查询 、插入、遍历 
     */
    private final static Logger LOG=Logger.getLogger(TestList.class);
    public static void main(String[] args) {
        List list=new ArrayList(); 
        LOG.info(list);
        /*添加元素 */
        LOG.info("添加元素");
        list.add("jikexueyuan");
        LOG.info(list);
        list.add(12345);
        list.add(true);
        LOG.info("list添加后的元素有:"+list);
        LOG.info("长度为:"+list.size());
        /*for循环输出*/
        LOG.info("for循环输出");
        for (int i = 0; i < list.size(); i++) {
            LOG.info("第"+(i+1)+"个元素为:"+list.get(i));
        }
        /*迭代器的使用*/
        LOG.info("迭代输出");
        Iterator iterator=list.iterator();
        for (int i = 0; i < list.size(); i++) {
            LOG.info("第"+(i+1)+"个元素为:"+iterator.next());
        }
        /*插入元素  在下标为1的位置添加了龙王，原下标为1的12345自动后移一位*/
        LOG.info("插入元素");
        list.add(1, "龙王");
        iterator=list.iterator();
        for (int i = 0; i < list.size(); i++) {
            LOG.info("第"+(i+1)+"个元素为:"+iterator.next());
        }
        /*替换元素  将元素下标为2的12345替换为王者归来*/
        LOG.info("替换元素");
        list.set(2, "王者归来");
        iterator=list.iterator();
        for (int i = 0; i < list.size(); i++) {
            LOG.info("第"+(i+1)+"个元素为:"+iterator.next());
        }
        /*删除元素   元素下标为1的龙王被删掉了*/
        LOG.info("删除元素");
        list.remove(1);
        iterator=list.iterator();
        for (int i = 0; i < list.size(); i++) {
            LOG.info("第"+(i+1)+"个元素为:"+iterator.next());
        }
        /*查询元素*/
        LOG.info("查询元素");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();        
        LOG.info("第"+num+"个元素是:"+list.get(num-1));
        scanner.close();
    }

}

