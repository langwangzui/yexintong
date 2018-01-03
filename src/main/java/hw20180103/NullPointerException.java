/**
 * Project Name:dt59homework
 * File Name:NullPointerException.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午5:41:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午5:41:31 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class NullPointerException {
    private final static Logger LOG=Logger.getLogger(NullPointerException.class);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        //定义一个空的字符串
        String str = null;  
        LOG.info(str); 
        //尝试对空字符串进行操作，并捕获异常，输出异常
        try{
            LOG.info(str.charAt(0));
        }catch(Exception e){
            LOG.info("异常信息:空指针异常");
            e.printStackTrace(); 
            LOG.info(e);
        }
    }
}

