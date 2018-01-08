/**
 * Project Name:dt59homework
 * File Name:PriorityDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午5:11:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import java.util.Random;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午5:11:53 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class PriorityDemo extends Thread {
    private final static Logger LOG = Logger.getLogger(PriorityDemo.class);

    int num;

    public PriorityDemo(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 2 == 0) {
            LOG.info("\n我最帅"+num);
        } else if (num == 5) {
            LOG.info("\n我最衰"+num);
        } else {
            LOG.info("\n我划水"+num);
        }
    }
}
