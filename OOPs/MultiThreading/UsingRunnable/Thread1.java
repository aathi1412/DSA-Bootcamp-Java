package JavaBootcamp.OOPs.MultiThreading.UsingRunnable;

public class Thread1 implements Runnable{
    
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
