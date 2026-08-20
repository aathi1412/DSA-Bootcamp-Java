package oops.carz;

public class Owner extends Car{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    Owner(String name,String address,String type,String brand,String color){
        super(brand, color, type);
        this.name=name;
        this.address=address;
    }
    public void display(){
        start();
        System.out.println("Type of Vehicle:"+getType());
        System.out.println("Brand name:"+getBrand());
        System.out.println("Color:"+getColor());
        System.out.println("Ownwer name:"+name);
        System.out.println("Adress:"+address);
    } 
    
}
