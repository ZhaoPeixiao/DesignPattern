package com.peixiao.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        List<College> colleges = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollefge infoCollefge = new InfoCollefge();
        colleges.add(computerCollege);
        colleges.add(infoCollefge);

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }
}
