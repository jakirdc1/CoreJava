
package Jannat;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student(100, "JOy", Gender.MALE, new District(1000, "Dhaka"));
        Student s2 = new Student(101, "JOy", Gender.MALE, new District(1001, "Khulan"));
        Student s3 = new Student(103, "JOy", Gender.MALE, new District(1003, "Sirajgonj"));
        
        List<Student> student = new ArrayList<>();
        
        student.add(s1);
         student.add(s2);
          student.add(s3);
          for(Student S : student){
          
          
          }
    }
}
