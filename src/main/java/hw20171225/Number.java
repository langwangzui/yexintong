/**
 * Project Name:dt59homework
 * File Name:Number.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:25:25
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:25:25 <br/>
 * @author   YeXinTong
 * @version
 * @see
 */
public class Number {
    Scanner scanner=new Scanner(System.in);
    int input1=scanner.nextInt();
    int a=input1;
    int input2=scanner.nextInt();
    int b=input2;
    int number(){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        //System.out.println("请输入第一个值:");
        //System.out.println("请输入第个值:");
        System.err.println("最大值是:"+new Number().number());
    }

}

