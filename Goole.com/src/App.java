
public class App {
    public static void main(String[] args) {
        Cow cow = new Cow("Tonny", 15, 500000.0);
        System.out.println("AGE-> "+ cow.getAge());
        System.out.println("Price-> "+ cow.getPrice());
        System.out.println("Name-> "+ cow.getName());
    }
}
