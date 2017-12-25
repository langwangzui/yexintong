/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:39:33
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:39:33 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class Vip {
    String vip1="白银级";
    String vip2="黄金级";
    String vip3="铂金级";
    String vip4="钻石级";
    String vip5="至尊级";
    double num(String vip,double money){
        double hoob=0;
        if(vip.equals(vip1)){
            hoob=money*0.95;
        }else if(vip.equals(vip2)){
            hoob=money*0.9;
        }else if(vip.equals(vip3)){
            hoob=money*0.85;
        }else if(vip.equals(vip4)){
            hoob=money*0.8;
        }else if(vip.equals(vip5)){
            hoob=money*0.75;
        }
        return hoob;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的等级");
        String vip=sc.next();
        System.out.println("请输入你的金额");
        double money=sc.nextDouble();
        System.out.println("你打折后的金额"+new Vip().num(vip, money));
       
    }
}

