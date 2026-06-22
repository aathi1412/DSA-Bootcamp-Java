

class Parent{
    int age;
    String name = "dad";

    Parent(String gpname, int age){
        this.age = age;
        
    }

    void sound(){
        System.out.println("ahhhhyyyyyyyyy");
    }
    
}
class Son extends Parent{
    String name;

    Son(String gpname, int age, String name){
        super(gpname,age);
        this.name = name;
    }

    void sound(){
        System.out.println("ahhhhyyyyyyyyy");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Son son = new Son("gp", 50, "son");
        // System.out.println(son.name);

        Parent parent = new Son("gp", 40, "p");
        System.out.println(parent.name);
        parent.sound();   
    }
}
