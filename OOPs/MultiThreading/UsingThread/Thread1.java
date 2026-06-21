package JavaBootcamp.OOPs.MultiThreading.UsingThread;

public class Thread1 extends Thread{
    
    public void run(){
        
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Thread1: " + e.getMessage());
            }
        }
        
    }
}
