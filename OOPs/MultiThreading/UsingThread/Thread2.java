package JavaBootcamp.OOPs.MultiThreading.UsingThread;

public class Thread2 extends Thread{
    public void run(){
        
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Thread2: " + e.getMessage());
            }
        }
        
    }
}
