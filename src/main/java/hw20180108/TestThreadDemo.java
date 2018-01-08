/**
 * Project Name:dt59homework
 * File Name:TestThreadDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:45:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:45:48 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class TestThreadDemo {
    public static void main(String[] args) {
        for (int i = 65; i > 64 && i < 90; i++) {
            ThreadDemo td = new ThreadDemo(i);

            td.start();

        }
    }
}
