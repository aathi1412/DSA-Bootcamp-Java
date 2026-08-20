package oops.Smartdevices;

public class Room {
    //************ */
    private String roomName;
    public String getRoomName() {
        return roomName;
    }
//**************** */
    private SmartDevice device1;
    public SmartDevice getDevice1() {
        return device1;
    }
//*************** */
    private SmartDevice device2;
    public SmartDevice getDevice2() {
        return device2;
    }
//************** */
    public Room(String roomName, SmartDevice device1, SmartDevice device2){
        this.roomName = roomName;
        this.device1 = device1;
        this.device2 = device2;

    }

    public void showRoomDevices(){
        System.out.println();
        System.out.println("Room :"+ getRoomName());
        System.out.println("Device :"+ device1.getDeviceName());
        System.out.println("Device :"+ device2.getDeviceName());
        System.out.println();
    }

    public void controlDevice(){
        device1.performFunction();
        device2.performFunction();
    }
}
