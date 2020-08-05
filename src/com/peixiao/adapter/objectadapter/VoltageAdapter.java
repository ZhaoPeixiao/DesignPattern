package com.peixiao.adapter.objectadapter;

/**
 * @Author: Peixiao Zhao
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;    // 关联关系中的聚合关系

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }


    @Override
    public int output5V() {
        // 获取到220V电压
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器进行适配");
            dst = src / 44;
            System.out.println("适配完成， 输出电压为 " + dst + "V");
        }
        return dst;
    }
}
