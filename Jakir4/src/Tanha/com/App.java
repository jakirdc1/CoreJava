
package Tanha.com;

import java.util.ArrayList;
import java.util.List;




public class App {
    public static void main(String[] args) {
       Student s1 = new Student(101, "Jakir", Gender.MALE, new District(1001, "Dhaka"));
       Student s2 = new Student(102, "Jony", Gender.MALE, new District(1002, "Dhaka"));
       Student s3 = new Student(103, "Mony", Gender.FEMALE, new District(1003, "khulna"));
       Student s4 = new Student(104, "Tanha", Gender.MALE, new District(1004, "rongpur"));
       Student s5 = new Student(105, "Mory", Gender.FEMALE, new District(1005, "nowakali"));
              
            List<Student> studen = new ArrayList();
            
            studen.add(s1);
            studen.add(s2);
            studen.add(s3);
            studen.add(s4);
            studen.add(s5);
            
          System.out.println("=============Output===============");
          System.out.println(" StudentID        Name       Gender     ID      District");
          
          System.out.println("-----------------------------------------------------------");
        
          for(Student s : studen){
              System.out.println("   "+s.getStudentID()
                                   +"           "+ s.getName()
                                    +"          "+s.getGender()
                                    +"      "+s.getDistrict().getCode()
                                    +"      "+s.getDistrict().getDistrictName());
                   
          }
          
          
        System.out.println("------------------------Ok--------ok-----------ok----------------");
              System.out.println(".....................This is output.................");
              for(Student s : studen){
                  if(s.getGender() == Gender.FEMALE){
              
              System.out.println("      "+s.getStudentID()
                                   +"             "+ s.getName()
                                    +"           "+s.getGender()
                                    +"      "+s.getDistrict().getCode()
                                    +"      "+s.getDistrict().getDistrictName());
              
              
          }
    }
              
   }
    }