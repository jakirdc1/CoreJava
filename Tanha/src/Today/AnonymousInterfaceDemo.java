
package Today;

public class AnonymousInterfaceDemo {
    public static void main(String[] args) {
        Amimal animal = new Amimal() {
            @Override
            public void bite() {
                System.out.println("Animal can bite");
                 }

            @Override
            public void run() {
               System.out.println("Animal can run"); 
                
            }
        };
        animal.bite();
        animal.run();
    }
}
