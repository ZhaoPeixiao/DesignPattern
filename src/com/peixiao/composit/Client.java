package com.peixiao.composit;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {
        University university = new University("USTC", "China Top University");

        College information = new College("Information", "Information Science");
        College cs = new College("Computer", "Computer Science");

        university.add(information);
        university.add(cs);

        Department se = new Department("Software Engineering", "11");
        Department est = new Department("Electronic Science and Technology", "6");
        Department bme = new Department("biomedical engineering", "23");

        information.add(est);
        information.add(bme);
        cs.add(se);

        university.print();

    }
}
