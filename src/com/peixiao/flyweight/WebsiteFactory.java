package com.peixiao.flyweight;

import java.util.HashMap;

/**
 * @Author: Peixiao Zhao
 */
public class WebsiteFactory {

    // 集合，充当线程池
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    // 根据网站的类型，返回一个网站
    // 如果没有就创建一个网站，并放入池中，并返回
    public Website getWebsiteCategory(String type){
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return (Website) pool.get(type);
    }

    // 获取网站分类的总数(池中有多少个网站类型)
    public int getWebsiteCount(){
        return pool.size();
    }
}
