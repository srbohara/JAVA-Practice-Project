package com.coreJava.interfaceDemo;

interface LoginService {
    public boolean login(String userName, String password);

    static void displayMessage(String message){
        System.out.println(message);

    }


}
