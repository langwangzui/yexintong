/**
 * Project Name:dt59homework
 * File Name:TestInterfaceDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:21:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:21:13 <br/>
 * 
 * @author YeXinTong
 * @version
 * @see
 */
public class TestInterfaceDemo {
    public static void main(String[] args) {
        for(int j = 0;j<10;j++){
        InterfaceDemo ID=new InterfaceDemo() {};
        new Thread(ID).start();
        }
    }
}
