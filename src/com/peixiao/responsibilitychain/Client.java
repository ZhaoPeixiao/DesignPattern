package com.peixiao.responsibilitychain;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 8000, 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("Dr.Zhanng");
        CollegeApprover collegeApprover = new CollegeApprover("Dr.Li");
        ViceSchoolMaster viceSchoolMaster = new ViceSchoolMaster("Dr.Wang");
        SchoolMaster schoolMaster = new SchoolMaster("Dr.Chen");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMaster);
        viceSchoolMaster.setApprover(schoolMaster);
        schoolMaster.setApprover(departmentApprover);


        viceSchoolMaster.processRequest(purchaseRequest);
    }
}
