package com.coreJava.collectionFramwork;

import com.coreJava.encapsulationDemo.Student;

import java.util.ArrayList;
import java.util.List;

public class mainProgram {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Student student= new Student(1,"Ram",25,"KTM","sCIENCE");
        students.add(student);
        Student student1= new Student();
        student1.setAddress("Pokhara");
        student1.setFaculty("Maths");
        student1.setId(1);
        student1.setName("Hari");
        student1.setRollNo(5);
        students.add(student1);
        for (Student studentLists: students ){
            mainProgram.displayStudents(studentLists);





        }

    }
   public static void  displayStudents(Student student){
       System.out.println("Id of the student is "+student.getId());
       System.out.println("Name of the student is "+student.getName());
       System.out.println("Address of the student is "+student.getAddress());
       System.out.println("Roll No of the student is "+student.getRollNo());
       System.out.println("Faculty of the student is "+student.getFaculty());
   }
}
