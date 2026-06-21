package JavaBootcamp.OOPs.Abstraction;

public class Son extends Parent{

    @Override
    public void start(){
        System.out.println("Starting..........");
    }
    
    @Override
    void run(){
        System.out.println("Running..........");
    }
}
