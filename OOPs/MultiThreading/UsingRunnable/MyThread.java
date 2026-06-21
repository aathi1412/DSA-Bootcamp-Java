package JavaBootcamp.OOPs.MultiThreading.UsingRunnable;

public class MyThread {
    public static void main(String[] args) {
        
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("MyThread: " + e.getMessage());
        }
        t2.start();

        // using Lambda Expression

        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Arigatho!!!");
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thankyou!!!");
            }
        };
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t3.start();

        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("MyThread: " + e.getMessage());
        }
        
        t4.start();
    }
}
