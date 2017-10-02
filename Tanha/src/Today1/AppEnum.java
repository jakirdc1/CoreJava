
package Today1;

public class AppEnum {
    public static void main(String[] args) {
        Person person = new Person("Jakir Hossain", 30, Gender.MALE);
         System.out.println("Agg is : "+person.getAge());
          System.out.println("===================");
        System.out.println("Name is : "+person.getName());
         System.out.println("================= ");
       
          System.out.println("Gender is : "+person.getGender());
  /*         +"Age is : "+person.getAge()
     *               +"Gender is : "+person.getGender()
                            );
*/
        
    }
}
