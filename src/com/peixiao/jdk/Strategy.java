package com.peixiao.jdk;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Peixiao Zhao
 */
public class Strategy {

    public static void main(String[] args) {

        Integer[] data = {9, 4, 5, 1, 3, 8};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                }else {
                    return 1;
                }
            }
        };

        Arrays.sort(data, comparator);


        System.out.println(Arrays.toString(data));

        Integer[] data1 = {91, 41, 51, 11, 31, 81};

        Arrays.sort(data1, (var1, var2) -> {
            if (var1.compareTo(var2) > 0) {
                return 1;
            }
            else{
                return -1;
            }
        });

        System.out.println(Arrays.toString(data1));
    }
}
