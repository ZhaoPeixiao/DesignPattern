package com.peixiao.responsibilitychain;

/**
 * @Author: Peixiao Zhao
 */
public class SchoolMaster extends Approver{


    public SchoolMaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000){
            System.out.println("Purchase ID = " + purchaseRequest.getId() + " is processed by " + this.name);
        }
        else {
            approver.processRequest(purchaseRequest);
        }
    }
}
