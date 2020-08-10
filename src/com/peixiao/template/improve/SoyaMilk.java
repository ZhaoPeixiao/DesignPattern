package com.peixiao.template.improve;

/**
 * @Author: Peixiao Zhao
 */
public abstract class SoyaMilk {

    // 模版方法, 可以做成final，不让子类覆盖
    final void make(){
        select();
        if (isCustomerWantCondiments()) {
            addCondiments();
        }
        soak();
        mix();
    }

    void select(){
        System.out.println("Step 1 : choose fresh beans");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("Step 3 : soak beans and condiments for 3 hours");
    }

    void mix(){
        System.out.println("Step 4: mix up beans and condiments");
    }

    // 钩子方法，决定是否需要添加配料
    boolean isCustomerWantCondiments(){
        return true;
    }
}
