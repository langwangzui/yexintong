/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:16:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:16:28 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public abstract class Car {
    private int sit;
    public int getSit() {
        return sit;
    }
    public void setSit(int sit) {
        this.sit = sit;
    }
    public abstract void sit();
}

