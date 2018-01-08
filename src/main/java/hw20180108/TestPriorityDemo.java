/**
 * Project Name:dt59homework
 * File Name:TestPriorityDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午5:23:24
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import java.util.Random;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午5:23:24 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class TestPriorityDemo {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = i;
            PriorityDemo pd = new PriorityDemo(num);
            if (num % 2 == 0) {
                pd.setPriority(pd.MAX_PRIORITY);
               
            } else if (num == 8) {
                pd.setPriority(pd.MIN_PRIORITY);
                
            }
            pd.start();
        }
    }
}
