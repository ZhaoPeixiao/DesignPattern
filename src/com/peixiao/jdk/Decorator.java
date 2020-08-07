package com.peixiao.jdk;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: Peixiao Zhao
 */
public class Decorator {

    public static void main(String[] args) throws IOException {

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.txt"));
        System.out.println(dataInputStream.read());
        dataInputStream.close();

    }
}
