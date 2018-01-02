/**
 * Project Name:dt59homework
 * File Name:MinCar.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:16:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:16:40 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class MinCar extends Car {

    public MinCar(int sit){
        this.setSit(sit);
    }
    @Override
    public void sit() {
        System.out.println("小汽车可以乘载"+getSit()+"人");
    }
    public void site(){
        System.out.println("巴士可以乘载20人");
    }
  
}

