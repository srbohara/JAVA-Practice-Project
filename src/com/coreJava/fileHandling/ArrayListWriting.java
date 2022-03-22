package com.coreJava.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArrayListWriting {
    public static void main(String[] args) {
        try {


            new String("CUSTOMER_ID,RECEIVER_ID, ...................");
            ArrayList<String  > arrayList = new ArrayList<>();
            arrayList.add(0, "RAM");
            arrayList.add(1, "hari");
            arrayList.add(2, "krishna");
            arrayList.add(3, "Gopal");
            //System.out.println(arrayList);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\JAVA\\index.txt"));
            for (String myList : arrayList) {
                bufferedWriter.write( myList+"/n");
                //System.out.println(myList);

            }
            bufferedWriter.close();

            BufferedReader bufferedReader= new BufferedReader(new FileReader("E:\\JAVA\\index.txt"));
            String myDataLists;
           while ((myDataLists=bufferedReader.readLine())!=null){
               System.out.println(myDataLists);
           }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
