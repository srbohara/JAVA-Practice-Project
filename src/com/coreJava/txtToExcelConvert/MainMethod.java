package com.coreJava.txtToExcelConvert;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
    public static void main(String[] args) {
        List<ModelClass> modelClasses = new ArrayList<ModelClass>();
        ModelClass modelClass1= new ModelClass(1, "Subidhanagar-32", "Kathmandu", "Ram","Shrestha","Bagmati","402051");
        ModelClass modelClass2= new ModelClass(2, "Baneshwor-32", "Kathmandu", "hari","Dhakal","Bagmati","402051");
        ModelClass modelClass3= new ModelClass(3, "Koteshwor-32", "Kathmandu", "yogesh","hamal","Bagmati","402051");
        ModelClass modelClass4= new ModelClass(4, "balaju-32", "Kathmandu", "sajan","maharjan","Bagmati","402051");
        modelClasses.add(modelClass1);
        modelClasses.add(modelClass2);
        modelClasses.add(modelClass3);
        modelClasses.add(modelClass4);
        for (ModelClass myLists:modelClasses ) {
            myLists.toString();


        }
       /* try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\JAVA\\newFile.txt"));
            for (ModelClass myClass: modelClasses) {
                writer.write(myClass.getId(), myClass.getFirstName(), myClass.getLastName(), myClass.getAddress(), myClass.getCity(), myClass.getState(), myClass.getZip());
            }
            writer.close();
            for (ModelClass myClass: modelClasses
                 ) {
                writer.write(String.valueOf(myClass));
                  }

        }catch(IOException exception) {
            exception.printStackTrace();

        }*/
        /*try {


            FileInputStream fileInputStream = new FileInputStream("E:\\JAVA\\output.txt");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);


                objectInputStream.read();
            objectInputStream.close();


        }catch (Exception e){
            e.getStackTrace();
        }
*/




    }
}
