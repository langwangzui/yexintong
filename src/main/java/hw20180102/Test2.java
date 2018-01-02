/**
 * Project Name:dt59homework
 * File Name:Test2.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:38:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:38:29 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class Test2 {

    public static void main(String[] args) {
        int sit = 0;
        Car carBus=new Bus(sit);
        carBus.setSit(sit);
        Bus bus=(Bus)carBus;
        bus.siter(new Bus(5)).sit();
       // MinCar minCar=new MinCar(2);
        bus.siter(new MinCar(2)).sit();
      
    }
}

