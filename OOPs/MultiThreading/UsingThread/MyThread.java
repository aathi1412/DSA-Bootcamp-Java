package JavaBootcamp.OOPs.MultiThreading.UsingThread;

public class MyThread {
    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("MyThread: " + e.getMessage());
            }
        t2.start();
    }
}
