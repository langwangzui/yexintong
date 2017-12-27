/**
 * Project Name:dt59homework
 * File Name:HomeWork1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:31:33
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:31:33 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class HomeWork1 {
    String name="老王";
    char sex='男';
    int age=25;
    public HomeWork1() {
        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);        
    }
    public static void main(String[] args) {
       HomeWork1 homework1=new HomeWork1();
       homework1.name="老黄";
       homework1.sex='女';
       homework1.age=45;
       System.out.println("***************");
       System.out.println(homework1.name);
       System.out.println(homework1.sex);
       System.out.println(homework1.age);
    }
}

