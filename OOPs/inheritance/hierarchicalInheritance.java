

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
class cat extends Animal{
    void sound(){
        System.out.println("meow");
    } 
}

public class hierarchicalInheritance {

    public static void main(String[] args) {

        Animal c = new cat();
        Animal d = new dog();
        c.sound();
        d.sound();
    }
}
