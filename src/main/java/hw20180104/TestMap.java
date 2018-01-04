/**
 * Project Name:dt59homework
 * File Name:TestMap.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:39:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午3:39:34 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class TestMap {
    /**
     * Map 做练习：添加、修改、删除 、查询 、插入、遍历 
     */
    private final static Logger LOG=Logger.getLogger(TestList.class);
    public static void main(String[] args) {
        Map map=new HashMap();//构造一个带有默认初始容量(16)和默认加载因子(0.75)的空HashMap
        LOG.info("\n"+map);
        /*添加映射关系*/
        LOG.info("\n添加映射关系");
        map.put(1,546);
        map.put(0,"剑魂");
        map.put(2,"狱血魔神");
        map.put(3, "超大陆加恍惚套");
        LOG.info("\n添加后的映射关系有:"+map);
        LOG.info("\n映射关系数有:"+map.size());
        /*删除映射关系*/
        LOG.info("\n删除映射关系");
        map.remove(3);
        LOG.info("\n添加后的映射关系有:"+map);
        LOG.info("\n映射关系数有:"+map.size());
        /*查询映射关系*/
        LOG.info("\n查询映射关系");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        LOG.info("\n查询的映射关系是:"+map.get(num1));
        /*判断映射含键-值映射关系*/
        LOG.info("\n判断映射含键-值映射关系");
        int num2=scanner.nextInt();
        if(map.containsKey(num2)){
            LOG.info("\n在此键值对中存在映射关系");
        }else{
            LOG.info("\n不在此键值对中存在映射关系");
        }
        scanner.close();
        /*迭代器的使用*/
        Set set=map.entrySet();
        Iterator iterator=set.iterator();
        for (int i = 0; i < map.size(); i++) {
            LOG.info("\n"+"第"+(i+1)+"个元素为:"+iterator.next());
        }
    }

}

