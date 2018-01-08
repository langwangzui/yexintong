/**
 * Project Name:dt59homework
 * File Name:ThreadDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:40:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:40:12 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class ThreadDemo extends Thread{
    private final static Logger LOG=Logger.getLogger(ThreadDemo.class);
    int i;
    ThreadDemo(int i){
        this.i=i;
    }
    @Override
    public void run() {
        if((char)i=='B'){
            LOG.info("这就是爱");
        }else{
            LOG.info((char)i);
        }
    }
    
}

