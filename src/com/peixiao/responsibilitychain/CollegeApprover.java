package com.peixiao.responsibilitychain;

/**
 * @Author: Peixiao Zhao
 */
public class CollegeApprover extends Approver{


    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 10000 && purchaseRequest.getPrice() > 5000) {
            System.out.println("Purchase ID = " + purchaseRequest.getId() + " is processed by " + this.name);
        }
        else{
            approver.processRequest(purchaseRequest);
        }
    }

}
