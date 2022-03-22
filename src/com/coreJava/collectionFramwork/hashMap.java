package com.coreJava.collectionFramwork;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {
        Map<String, Object> myLists = new HashMap<>();
        myLists.put("Ram", "Hello World");
        myLists.put("Shyam",new Date());
        myLists.put("John","Shyam");
        myLists.put("Krishna","Hari");
        myLists.put("Peter","Hari");

        System.out.println(myLists);




    }
}
