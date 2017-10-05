
package Jannati.com;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class App {
    public static void main(String[] args) {
       Student st1 = new Student(1, "Jakir", Gender.MALE, new Country(10, "Bang"), 500);
       Student st2 = new Student(2, "Jui", Gender.FEMALE, new Country(11, "Iran"), 300);
       Student st3 = new Student(3, "Tanha", Gender.FEMALE, new Country(12, "Iran"), 400);
       
       List<Student> studentList = new ArrayList<>();
      studentList.add(st1);
      studentList.add(st2);
      studentList.add(st3);
      
      System.out.println("Size: "+studentList.size());
      System.out.println(" ID " + " Name " +"  Gender "  + "  Country  " + "  Salary ");
      
      for(Student S : studentList){
          System.out.println("  "+S.getId()
                              +"  "+S.getName()
                              +"  "+S.getGender()
                                +"  " +S.getCountry()
                                 );
      
      }
    }
 
}
