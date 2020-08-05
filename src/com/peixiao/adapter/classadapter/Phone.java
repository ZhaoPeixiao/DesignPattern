package com.peixiao.adapter.classadapter;

/**
 * @Author: Peixiao Zhao
 */
public class Phone {


    public void charge(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5) {
            System.out.println("Voltage is 5V, start to charge");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("Voltage is large than 5V, fail to charge");
        }else {
            System.out.println("Voltage is less than 5V, fail to charge");
        }
    }
}
