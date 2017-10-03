package collectionss.sets;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person(10, "Jakir", Gender.MALE);
        Person p2 = new Person(20, "Shamim", Gender.MALE);
        Person p3 = new Person(30, "Tanha", Gender.FEMALE);
        Person p4 = new Person(40, "Marzia", Gender.FEMALE);

        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
      

            System.out.println("Size :  " + personList.size());
            System.out.println("ID"  + "Name" +  "Gender");
              for (Person p : personList) {
               //   if(p.getGender() == Gender.FEMALE){
                System.out.println(" " + p.getId() + "  " + p.getName() + "  " + p.getGender());

              // }
        }

    }

}
