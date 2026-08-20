package oops.Smartdevices;

public abstract class SmartDevice {
    //********** */
    private String deviceName;
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
//************ */
    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
    }

    //********** */
    public abstract void performFunction(); 
}
