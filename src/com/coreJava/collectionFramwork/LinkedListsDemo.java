package com.coreJava.collectionFramwork;

import java.util.LinkedList;


public class LinkedListsDemo {

    public static void main(String[] args) {

        LinkedList<String> myLinkedLists = new LinkedList<>();
        myLinkedLists.add("Ram");myLinkedLists.add("Shyam");
        myLinkedLists.add("John");myLinkedLists.add("Hari");
        myLinkedLists.add("Gopal");myLinkedLists.add("Peter");
        myLinkedLists.add("Tiger");myLinkedLists.add("Newton");
        myLinkedLists.addFirst("Image");
        myLinkedLists.addLast("Lion");
        myLinkedLists.add(3,"HariRam");
        myLinkedLists.remove(3);

        System.out.println(myLinkedLists);



    }
}
