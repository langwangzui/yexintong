/**
 * Project Name:dt59homework
 * File Name:HomeWork3$1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:59:59
 * Copyright (c) 2017, plumb All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:59:59 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class HomeWork3$1 {
    String name;
    char sex;
    int age;
    public HomeWork3$1(String name) {
        this.name=name;
        System.out.println(name+"\n"+sex+"\n"+age);
    }
    public HomeWork3$1(String name,char sex) {
        this(name);
        this.sex=sex;
        System.out.println(name+"\n"+sex+"\n"+age);
    }
    public HomeWork3$1(String name,char sex,int age) {
        this(name,sex);
        this.age=age;
        System.out.println(name+"\n"+sex+"\n"+age);
    }
}

