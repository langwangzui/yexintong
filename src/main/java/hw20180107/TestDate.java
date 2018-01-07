/**
 * Project Name:dt59homework
 * File Name:TestDate.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午3:02:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午3:02:12 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class TestDate {
    private final static Logger LOG=Logger.getLogger(TestFile.class);
    public static void main(String[] args) {
        /*1、直接输入时间  已过时*/
        @SuppressWarnings("deprecation")
        Date date=new Date(2018-1900,1-1,07,15,19);
        LOG.info("\n"+date);
        /*2、直接从电脑上获取时间*/
        date=new Date();
        LOG.info("\n"+date);
        /*3、将直接输入的时间用中文形式表达*/
        SimpleDateFormat SDF=new SimpleDateFormat();
        String stringDate=SDF.format(date);
        LOG.info("\n"+stringDate);
        /*4、将输入的时间按自己想要的输出方式输出*/
        /**
         * G  Era                 标志符                                                   Text  AD  
         * y  年                                                Year                    1996; 96  
         * M  年中的月份                                 Month                   July; Jul; 07  
         * w  年中的周数                                 Number                  27  
         * W  月份中的周数                              Number                  2  
         * D  年中的天数                                 Number                  189  
         * d  月份中的天数                             Number                  10  
         * F  月份中的星期                             Number                  2  
         * E  星期中的天数                             Text                    Tuesday; Tue  
         * a  Am/pm                标记                                                   Text  PM  
         * H  一天中的小时数（0-23）        Number                  0  
         * k  一天中的小时数（1-24）        Number                  24  
         * K  am/pm 中的小时数（0-11） Number                  0  
         * h  am/pm 中的小时数（1-12） Number                  12  
         * m  小时中的分钟数                          Number                  30  
         * s  分钟中的秒数                              Number                  55  
         * S  毫秒数                                         Number                  978  
         * z  时区                                             General time zone       Pacific Standard Time; PST; GMT-08:00  
         * Z  时区                                             RFC 822 time zone       -0800  
         */
        SimpleDateFormat SDF1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");//定义的形式
        String stringDate1=SDF1.format(date);
        LOG.info("\n"+stringDate1);
        /*5、从电脑上获取时间的毫秒数，然后转化输出*/
        long num=System.currentTimeMillis();
        date=new Date(num);
        LOG.info("\n"+SDF1.format(date));
    }
}

