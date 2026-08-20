package oops.Smartdevices;

public class Thermostat extends SmartDevice {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
//******************** */
    public Thermostat( String deviceName, double temperature){
        super(deviceName);
        this.temperature = temperature;
    }
    @Override
    public void performFunction() {
        System.out.println("2. Thermostat '"+ getDeviceName()+"' is set to "+ getTemperature()+"°C");
    }
    
}
