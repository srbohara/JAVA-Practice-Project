package com.coreJava.interfaceDemo;

public class TeacherLoginImpl implements LoginService {
    @Override
    public boolean login(String userName, String password) {
        if (userName.equalsIgnoreCase("Krishna") && password.equalsIgnoreCase("test"))
            return true;
        else
            return false;
    }
}
