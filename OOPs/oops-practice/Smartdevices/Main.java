package oops.Smartdevices;

public class Main {
    public static void main(String[] args) {
        Light L1 = new Light("Living Room Light", 75);
        Thermostat t1 = new Thermostat("Living Room Thermostat", 22.5);
        Room livingRoom = new Room("Living Room", L1, t1);

        Light L2 = new Light("BedRoom Light", 60);
        Thermostat t2 = new Thermostat("BedRoom Thermostat", 25.5);
        Room bedRoom = new Room("BedRoom", L2, t2);


        House h1 = new House(livingRoom, bedRoom);
        h1.showAllDevices();
        h1.controlAllDevice();
    }
    
}
