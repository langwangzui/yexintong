/**
 * Project Name:dt59homework
 * File Name:Bus.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:16:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:16:47 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class Bus extends Car {
    private Car car;
    public Bus(int sit){
        this.setSit(sit);
    }
    @Override
    public void sit() {
        System.out.println("巴士可以乘载"+getSit()+"人");
    }
    public void site(){
        System.out.println("巴士可以乘载20人");
    }
    public Car siter(Car car) {
        if( car instanceof Bus){
            return this.car=car;
        }else if(car instanceof Car){
            return this.car=car;
        }
        return car;
    }


}

