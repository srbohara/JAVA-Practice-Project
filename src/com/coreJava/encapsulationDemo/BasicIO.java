package com.coreJava.encapsulationDemo;

import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        User user= new User(1,"Ram","KTM","9846985698");
        /*Student student=new Student(1,"Hari",5,"Pokhara","Science");
        System.out.println(student.getAddress());
        System.out.println(user.getAddress());
        System.out.println(user.getId());
        System.out.println(user.getMobileNumber());
        System.out.println(user.getName());
        String st= new String("Ram");
        st.concat("Softwer Engineer");//Couldn't concat Due to Immuatable Property of String
        System.out.println(st);
        StringBuffer sb= new StringBuffer("Hari");
        sb.append("Software Engineer");
        System.out.println(sb);*/
        System.out.println(user.toString());

    }
}
