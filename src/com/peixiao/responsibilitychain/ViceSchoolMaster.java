package com.peixiao.responsibilitychain;

/**
 * @Author: Peixiao Zhao
 */
public class ViceSchoolMaster extends Approver{


    public ViceSchoolMaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 30000 && purchaseRequest.getPrice() > 10000) {
            System.out.println("Purchase ID = " + purchaseRequest.getId() + " is processed by " + this.name);
        }
        else{
            approver.processRequest(purchaseRequest);
        }
    }
}
