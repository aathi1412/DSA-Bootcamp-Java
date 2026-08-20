package oops.carz;

abstract public class Vehicle {
    private String type;

    Vehicle(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    abstract void start();
}
