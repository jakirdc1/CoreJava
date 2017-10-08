package Jakir.com;

public class TestThrows {
     public static void main(String a[]) {
        TestThrows mytc = new TestThrows();
        try {
            for (int i = 0; i < 10; i++) {
                mytc.getSomething();
                System.out.println(i);
            }
        } catch (InterruptedException iex) {
            iex.printStackTrace();
        }
    }

    public void getSomething() throws InterruptedException {
        Thread.sleep(1000);
    }
}

