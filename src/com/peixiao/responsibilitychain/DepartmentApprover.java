package com.peixiao.responsibilitychain;

/**
 * @Author: Peixiao Zhao
 */
public class DepartmentApprover extends Approver{


    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("Purchase ID = " + purchaseRequest.getId() + " is processed by " + this.name);
        }
        else{
            approver.processRequest(purchaseRequest);
        }
    }
}
