/**
 * Project Name:dt59homework
 * File Name:HomeWork4$2.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:32:41
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:32:41 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class HomeWork4$2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        char sex=scanner.next().charAt(0);
        int age=scanner.nextInt();
        new HomeWork4$1().setName(name);
        new HomeWork4$1().setSex(sex);
        new HomeWork4$1().setAge(age);
        System.out.println("名字叫:"+name+"\n"+"性别是"+sex+"\n"+"年龄为:"+age);
    }

}

