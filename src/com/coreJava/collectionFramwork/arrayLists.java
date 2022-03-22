package com.coreJava.collectionFramwork;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class arrayLists {
    public static void main(String[] args) {
        String name[]={"Ram","Shyam","Hari","John"};
        List<String> myLists = new ArrayList<>();
        myLists.add("KTM");
        myLists.add("Pokhara");
        myLists.add("Biratnagar");
        myLists.add("Birjung");
        myLists.add("birtamod");
        /*System.out.println(myLists.indexOf("KTM"));
        System.out.println(myLists.add("Ram"));
        System.out.println(myLists.toString());
        for (String cityLists: myLists) {
            if (cityLists.startsWith("B")&& cityLists.startsWith("b")){
                System.out.println(cityLists);
            }
            
*/
        //Used by Lamdaa Expression
        //List<String> filterLists= myLists.stream().filter(cityName-> cityName.startsWith("b")||cityName.startsWith("B")).collect(Collectors.toList());
       // System.out.println(filterLists);

        List<String> filteredLists=myLists.stream().filter(cityName-> cityName.startsWith("A")||cityName.startsWith("a")).collect(Collectors.toList());
        System.out.println(filteredLists);


        List<String> myFilteredLists=myLists.stream().filter(cityname-> cityname.startsWith("a")||cityname.startsWith("A")).collect(Collectors.toList());
        System.out.println(myFilteredLists);





    }
}
