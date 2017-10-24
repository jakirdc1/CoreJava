
package ExceptionHandeling;

public class TestThrows {
    public static void main(String[] args) {
       TestThrows mytc = new TestThrows();
        try {
            for(int i =0; i<20; i++){
            mytc.getSomething();
                System.out.println("This is result: "+ i);
            }
        } catch (InterruptedException iex) {
            iex.printStackTrace();
        }
    }
    public void getSomething() throws InterruptedException{
    Thread.sleep(500);
    }
}
