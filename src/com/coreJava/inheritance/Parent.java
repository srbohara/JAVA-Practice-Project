package com.coreJava.inheritance;

public class Parent {
    void show(){
        System.out.println("Iam from Parent");
    }
}
 class Child extends Parent{
     @Override
     void show() {

         System.out.println("I am from Child ");
     }
 }
