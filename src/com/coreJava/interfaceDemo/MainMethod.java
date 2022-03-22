package com.coreJava.interfaceDemo;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Usename of Student");
        String username = sc.nextLine();
        System.out.println("Enter Password of Student");
        String password = sc.nextLine();
        LoginService loginService = new StudentLoginImpl();
        boolean result = loginService.login(username, password);
        if (result) {
            LoginService.displayMessage("Login Successful");

        } else {
            LoginService.displayMessage("Login Failed");
        }
    }
}
