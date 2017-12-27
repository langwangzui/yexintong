/**
 * Project Name:dt59homework
 * File Name:HomeWork5$2.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午5:19:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

import java.util.Scanner;

import dt59homework.studentInfor;

/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午5:19:53 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class HomeWork5$2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        new HomeWork5$1().setName(name);
        char sex=scanner.next().charAt(0);
        HomeWork5$1.setSex(sex);
    }  
}

