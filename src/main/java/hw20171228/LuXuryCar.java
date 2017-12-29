/**
 * Project Name:dt59homework
 * File Name:LuXuryCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午7:20:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午7:20:04 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class LuXuryCar extends Car {
    private int wheel;
    public LuXuryCar(String name,String color,int wheel) {
        setName(name);
        setColor(color);
        this.wheel=wheel;
    }
    
    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void summary() {
        System.out.println("我是豪车,豪车的名字是:" + this.getName() + "豪车的颜色是:" + this.getColor() +"豪车的轮子数是:"+this.getWheel());
    }
    public static void main(String[] args) {
        LuXuryCar luXuryCar= new LuXuryCar("玛莎拉蒂", "银色", 4);
        luXuryCar.summary();
    }
}

