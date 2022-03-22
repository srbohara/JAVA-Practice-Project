package com.coreJava.threadExample;

import java.util.concurrent.TimeUnit;

public class threadMainProgram {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new threadExample());
            thread.start();
            for (int i = 0; i <=10; i++) {
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("Downloading Facebook.."+i*10+"%");

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
