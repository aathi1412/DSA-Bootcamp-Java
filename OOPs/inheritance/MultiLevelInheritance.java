

class GrandParent{
    String name;

    GrandParent(String name){
        this.name = name;
    }

    void sound(){
        System.out.println("uuuuuu");
    }
}


class Parent extends GrandParent{
    int age;
    String name = "dad";

    Parent(String gpname, int age){
        super(gpname);
        this.age = age;
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

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Son son = new Son("gp", 50, "son");
        // System.out.println(son.name);

        GrandParent parent = new Son("gp", 40, "p");
        System.out.println(parent.name);
        parent.sound();   
    }
}
