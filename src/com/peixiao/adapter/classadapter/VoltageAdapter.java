package com.peixiao.adapter.classadapter;

/**
 * @Author: Peixiao Zhao
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        // 获取到220V电压
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
