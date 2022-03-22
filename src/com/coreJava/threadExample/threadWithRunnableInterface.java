package com.coreJava.threadExample;

import java.util.concurrent.TimeUnit;

public class threadWithRunnableInterface implements Runnable {
    @Override
    public void run() {
        try {
            for (int i=0; i<=10; i++){
                System.out.println("Thread Demo with Runnable Interface");
                TimeUnit.MILLISECONDS.sleep(200);
            }


        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}
