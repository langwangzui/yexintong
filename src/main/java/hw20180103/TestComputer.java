/**
 * Project Name:dt59homework
 * File Name:TestComputer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午5:36:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午5:36:58 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class TestComputer {
    private final static Logger LOG=Logger.getLogger(TestComputer.class);
    public static void main(String[] args) {
        LOG.info("青年用电脑:"+new Youth().play()+new Youth().watch());
    }

}

