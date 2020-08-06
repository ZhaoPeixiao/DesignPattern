package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class FeaturePhone extends Phone{

    public FeaturePhone(Brand brand) {
        super(brand);
    }

    public void boost(){
        super.boost();
        System.out.println("FeaturePhone");
    }

    public void shutdown(){
        super.shutdown();
        System.out.println("FeaturePhone");
    }

    public void call(){
        super.call();
        System.out.println("FeaturePhone");
    }
}
