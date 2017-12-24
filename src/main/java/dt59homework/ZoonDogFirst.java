/**
 * Project Name:dt59homework
 * File Name:ZoonDogFirst.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午2:48:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:48:47 <br/>
 * 
 * @author LangWang
 * @version
 * @see
 */
public class ZoonDogFirst {

    public static void main(String[] args) {
        ZoonDog zoonDog = new ZoonDog();
        System.out.print("狗的名字:");
        zoonDog.name();
        System.out.print("狗的性别:");
        zoonDog.sex();
        System.out.println("狗的年龄:" + zoonDog.year() + "岁");
        System.out.print("狗的爱好:");
        zoonDog.hobby();
        System.out.print("狗的颜色:");
        zoonDog.color();
    }

}
