/**
 * Project Name:dt59homework
 * File Name:MaxCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午7:08:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午7:08:00 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class MaxCar extends Car {
    private int wheel;
    
    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public  MaxCar(String name,String color,int wheel) {
        setName(name);
        setColor(color);
        this.wheel=wheel;
    }
    public void summary(){
        System.out.println("汽车的名字是:"+this.getName()+"汽车的颜色是:"+this.getColor()+"汽车的轮数为:"+this.getWheel());
    }
    public static void main(String[] args) {
        MaxCar maxCar=new MaxCar("东风", "黑色", 8);
        maxCar.summary();
    }
}

