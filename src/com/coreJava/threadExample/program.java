package com.coreJava.threadExample;

import java.util.concurrent.TimeUnit;

public class program {
    public static void main(String[] args) {
        try{
        Thread thread= new Thread(new threadWithRunnableInterface());
        thread.start();
        for ( int i=0; i<10; i++){
            TimeUnit.MILLISECONDS.sleep(100);
        }

    }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}

