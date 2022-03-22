package com.coreJava.collectionFramwork;

import java.util.ArrayList;
import java.util.*;

public class ArraysAndArrayLists {
    public static void main(String[] args) {
        //int [10] myArrayLists  = {1,2,3,4,5};
       /* int intArray[][] = {{1,2,3},{5,6,7}};
        for (int i=0; i<intArray.length; i++){
            for (int j=0; j<intArray[i].length; j++){
                System.out.println("i = "+i +" j = " +j);
            }
            System.out.println();
        }*/
       /* ArrayList<String> myLists= new ArrayList<>(Arrays.asList("Ram","Shyam","Krishna"));
        System.out.println(myLists.add("Gopal"));
        System.out.println(myLists.toString());*/
     /*  int [][] matrix = {{1,2,3},{4,5,6}};
       for (int i=0; i<matrix.length; i++){
           for (int j=0; j<matrix[i].length; j++){
               System.out.println(("args"+i+"args"+j)+"="+matrix[i][j]);
           }
       }*/
        //String[] listsString= {"Ram","Shyam","Madan"};
        //System.out.println(listsString.length);
       // System.out.println(listsString.clone());

      /*  ArrayList<String> myArrayLists = new ArrayList<>();
        myArrayLists.add(0,"Shyam");
        myArrayLists.add(1,"Shyam");
        myArrayLists.add(2,"Hari");
        myArrayLists.add(3,"Gopal");
        myArrayLists.add(4,"Krishna");
        myArrayLists.add(5,"Raj");

        System.out.println(myArrayLists.toString());*/
      List<String> myList= Arrays.asList("Ram","Shyam","Gopal","Hari");
      List<String> cloned_List = new ArrayList<>();
      cloned_List.addAll(myList);
        System.out.println(cloned_List);





    }
}
