/**
 * Project Name:dt59homework
 * File Name:InterfaceDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:04:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import java.util.Random;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:04:01 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public abstract class InterfaceDemo implements Runnable {
    private final static Logger LOG = Logger.getLogger(InterfaceDemo.class);

    @Override
    public void run() {
        String str = "";
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            int num = Math.abs(ran.nextInt())%35;
            int num1 = num + 65;
            str = str + (char) num1;
        }
        LOG.info(str);
    }
}