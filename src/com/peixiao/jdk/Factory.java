package com.peixiao.jdk;

import java.util.Calendar;

/**
 * @Author: Peixiao Zhao
 */
public class Factory {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // getInstance 是静态方法
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
