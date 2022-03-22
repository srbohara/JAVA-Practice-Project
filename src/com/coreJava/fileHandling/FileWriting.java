package com.coreJava.fileHandling;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) {
        //Writing to the file
        try {
            String name[] = {"ram", "Shyam", "Hari"};
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\JAVA\\output.txt"));
            bufferedWriter.write("Writing to file");
            for (String Sname : name) {
                bufferedWriter.write("\n" + Sname);
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Reading from the file
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\JAVA\\output.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }}
