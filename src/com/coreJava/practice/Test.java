package com.coreJava.practice;

public class Test {
    private  static int a=20;
    public static int b =15;
    public static int c=10;
    public static class Nested{
        private void display(){
            System.out.println(a+b+c);
        }
    }

    public static void main(String[] args) {
        Test.Nested inner= new Test.Nested();
           //inner.display();
           for (int i=0; i<args.length; i++){
               if ("debug".equalsIgnoreCase(args[i])){
                   //importer.debug =boolean.valueof(args[i+1]);
                   System.out.println(args);
               }
           }



            }
        }


