
package jakir.com;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
       Person p1 = new Person(1, "Jakir", Gender.MALE, new Country(10, "USA"), 10000.0);
        Person p2 = new Person(2, "Shmim", Gender.MALE, new Country(11, "BD"), 15000.0);
         Person p3 = new Person(3, "parvez", Gender.MALE, new Country(12, "Iraq"), 16000.0);
          Person p4 = new Person(4, "Tanha", Gender.FEMALE, new Country(13, "Iran"), 17000.0);
           Person p5 = new Person(5, "Jannati", Gender.FEMALE, new Country(14, "BD"), 18000.0);
            Person p6 = new Person(6, "Piyer", Gender.MALE, new Country(15, "USA"), 10900.0);
             Person p7 = new Person(7, "Potol", Gender.FEMALE, new Country(16, "BD"), 12000.0);
              Person p8 = new Person(8, "Atiq", Gender.MALE, new Country(17, "Iran"), 13000.0);
               Person p9 = new Person(9, "Ruhul", Gender.MALE, new Country(18, "Iraq"), 19000.0);
               
         List<Person> personList = new ArrayList<>();
         personList.add(p1);
          personList.add(p2);
           personList.add(p3);
            personList.add(p4);
             personList.add(p5);
              personList.add(p6);
               personList.add(p7);
                personList.add(p8);
                 personList.add(p9);
                 System.out.println("Size: "+personList.size());
                 
                 System.out.println("ID" + "Name" + "Gnder" + "Country" +" " + "Salary");
            
                 System.out.println("------------------------------------------------");
                  for (Person p : personList) {
            if (p.getGender() == Gender.FEMALE && p.getCountry().getCountryname() == "BD") {
               System.out.println("" + p.getId()
                       + " " + p.getName()
                       + " " + p.getGender()
                      + "  " + p.getCountry().getCountryname()
                       + "  " + p.getSalary());
                       
            }        
    }
    
    }  
}
