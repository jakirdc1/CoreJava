
public class Appcows {
    public static void main(String[] args) {
        Cows cow = new Cows();
       
        cow.setName("Tanny");
        cow.setAge(20);
        cow.setPrice(50000.);
        
        System.out.println("Age-> " + cow.getAge());
         System.out.println("Price-> " + cow.getPrice());
          System.out.println("Name-> " + cow.getName());
    }
}
