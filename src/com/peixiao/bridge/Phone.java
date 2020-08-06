package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand){
        super();
        this.brand = brand;
    }

    protected void boost(){
        this.brand.boost();
    }

    protected void shutdown() {
        this.brand.shutdown();
    }

    protected void call(){
        this.brand.call();
    }


}
