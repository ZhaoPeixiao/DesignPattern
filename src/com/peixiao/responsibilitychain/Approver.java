package com.peixiao.responsibilitychain;

/**
 * @Author: Peixiao Zhao
 */
public abstract class Approver {

    Approver approver;  //下一个处理者
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法,由子类完成，交给子类完成
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
