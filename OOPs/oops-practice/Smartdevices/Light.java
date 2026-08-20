package oops.Smartdevices;

public class Light extends SmartDevice{
    //**************** */
    private int brightnessLevel;
    public int getBrightnessLevel() {
        return brightnessLevel;
    }
    public void setBrightnessLevel(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }
//************** */
    public Light(String deviceName, int brightnessLevel){
        super(deviceName);
        this.brightnessLevel = brightnessLevel;
    }   

    @Override
    public void performFunction() {
        System.out.println("1. Light '"+ getDeviceName()+"' is adjusting brightness to" + getBrightnessLevel() +" %");
    }
}
