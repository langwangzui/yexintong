/**
 * Project Name:dt59homework
 * File Name:HomeWork1.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午6:49:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午6:49:35 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class Car {
    private String name;
    private String color;
    Car(){
        System.out.println("汽车的名字是:"+this.name+"小汽车的颜色是:"+this.color);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void summary(){
        System.out.println("汽车的名字是:"+this.name+"小汽车的颜色是:"+this.color);
    }
}

