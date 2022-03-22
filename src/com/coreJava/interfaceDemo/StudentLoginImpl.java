package com.coreJava.interfaceDemo;

public  class StudentLoginImpl implements LoginService {
    @Override
    public boolean login(String userName, String password) {
        if (userName.equalsIgnoreCase("test") && password.equalsIgnoreCase("test"))
            return true;
        else
        return false;
    }
}
