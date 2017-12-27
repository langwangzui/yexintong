/**
 * Project Name:dt59homework
 * File Name:HomeWork3$2.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:09:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:09:49 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class HomeWork3$2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name=scanner.next();
        new HomeWork3$1(name);
        System.out.println("请输入你的性别:");
        char sex=scanner.next().charAt(0);
        new HomeWork3$1(name,sex);
        System.out.println("请输入你的年龄:");
        int age=scanner.nextInt();
        new HomeWork3$1(name,sex,age);
    }
}

