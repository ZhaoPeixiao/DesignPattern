package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

//        FeaturePhone huawei = new FeaturePhone(new Huawei());
//        huawei.boost();
//        huawei.call();
//        huawei.shutdown();
//        System.out.println();
//        FeaturePhone xiaomi = new FeaturePhone(new XiaoMi());
//        xiaomi.boost();
//        xiaomi.call();
//        xiaomi.shutdown();
//        System.out.println();
//        SmartPhone huaweiSmart = new SmartPhone(new Huawei());
//        huaweiSmart.boost();
//        huaweiSmart.call();
//        huaweiSmart.shutdown();
//        System.out.println();
//        SmartPhone xiaomiSmart = new SmartPhone(new XiaoMi());
//        xiaomiSmart.boost();
//        xiaomiSmart.call();
//        xiaomiSmart.shutdown();
//        System.out.println();

            ChildrenPhone apple = new ChildrenPhone(new Apple());
            apple.boost();
            apple.call();
            apple.shutdown();

    }
}
