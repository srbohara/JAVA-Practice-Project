package com.coreJava.threadExample;

import java.util.concurrent.TimeUnit;

public class threadExample implements Runnable {
    public void run() {
        try {
            for (int i=0; i<10;i++){
                System.out.println("Downloading Youtube.."+i*10+"%");
                TimeUnit.MILLISECONDS.sleep(200);
            }


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
