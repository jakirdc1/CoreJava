
package Inheritance;

public class App {
    public static void main(String[] args) {
        // object create 
        Animal animal= new Animal();
        Animal dog = new Dog();
        Animal tommy = new Tommy();
        
        Dog dog1 = new Dog();
        Dog tommy1 = new Tommy();
        Tommy tommy2 = new Tommy();
        
        //Precedence Animal, dog Tommy
        
        
        Animal a0=animal;
        Animal a1=dog;
        Animal a2=tommy2;
        
       //casting process
       
        Dog d1 =(Dog)animal;
         Dog d2 =(Dog)tommy;
        
    }        
        
}    

