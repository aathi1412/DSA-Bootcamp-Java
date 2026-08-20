package oops.carz;

public class Car extends Vehicle implements drivable{
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    Car(String brand,String color,String type){
        super(type);
        this.brand=brand;
        this.color=color;
    }
    public  void start(){
        System.out.println("offf");
    }
}
