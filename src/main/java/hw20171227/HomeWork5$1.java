/**
 * Project Name:dt59homework
 * File Name:HomeWork5$1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:53:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

import dt59homework.studentInfor;

/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:53:00 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class HomeWork5$1 {
    String name;
    static char sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("姓名为:"+name);
        this.name = name;
    }
    public static char getSex() {
        return sex;
    }
    /**
     * 带有static的方法不用创建对象可以直接用类名调用，没有带static的方法需要创建
     * 一个对象进行赋值掉调用
     * 
     */
    public static void setSex(char sex) {
        System.out.println("性别为:"+sex);
        HomeWork5$1.sex = sex;
    }
    
}

