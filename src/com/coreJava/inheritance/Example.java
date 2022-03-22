package com.coreJava.inheritance;

public class Example {
    public int multiplier(int data){
        return data*5;
    }
}
class Example2 extends Example{
    private static int data;
    public Example2()
    {
        data=10;
    }

    public static void main(String[] args) {
        Example temp= new Example2();
        System.out.println(temp.multiplier(data));
    }
}