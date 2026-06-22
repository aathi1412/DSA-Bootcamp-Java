

//  ------------ Example 1 --- Inheritance
class Animal{
    void sound(){
        System.out.println("uuuuuu");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("bark");
    }    
}

//  ------------ Example 2 -- Abstract class
abstract class Car {
    abstract void start();
    abstract void stop();
    
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("Engine Starts");
    }

    @Override
    void stop() {
        System.out.println("Engine Stops");
    }
    
}
public class MethodOverRiding {
    public static void main(String[] args) {

        // Example 1
        Animal a = new Animal();
        a.sound();

        //  Example 2
        Car c = new BMW();
        c.start();
        c.stop();

        // Same method name with same parameters. 
        // Redefining parent class method in child class.
    }
}
