/**
 * Project Name:dt59homework
 * File Name:MinCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午6:56:20
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午6:56:20 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class MinCar extends Car {
    private int wheel;
    public MinCar(String name,String color,int wheel) {
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

    public void summary(){
        System.out.println("小汽车的名字是:"+this.getName()+"小汽车的颜色是:"+this.getColor()+"小汽车的轮数为:"+this.getWheel());
    }
    public static void main(String[] args) {
        MinCar minCar=new MinCar("宝马X6", "白色", 4);
        minCar.summary();
    }
}

