package com.peixiao.jdk;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
public class Composit {

    public static void main(String[] args) {

        Map<Integer, String> hashMap =new HashMap<>();
        hashMap.put(0, "123");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "234");
        map.put(2, "345");
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}
