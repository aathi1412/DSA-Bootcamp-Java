In smartdevice class ->
I created a abstract class smartdevice, and i created  private instance variable(devicename) and then i use getter & setter method for the variable.
I created a constructor and initialized the instance variable(devicename), and assigned to instance variable  by using { this } keyword.
 And then created a abstract method performFunction().

//*************
In Light class ->
Created a Light class and extends Smartdevice class.
Created  private variable brightnessLevel, and  use getter & setter method for brightnessLevel.
Created a constructor and initialized the instance variable(devicename, brightnessLevel) , and assigned brightnessLevel to instance variable  by {this} keyword.
Inside the constructor, i pass the variable (devicename) to the parent class by using the super() function.
And then overrided the abstract method performFunction().


//***************
In Thermostat class ->
Created a Thermostat class and extends smartdevice class.
Declared private variable temperature {double}, and then i use getter & setter method for the variable.
Created a constructor and initialized the instance variable(temperature), Inside the constructor, i pass the variable (temperature) to the parent class by using the super() function.
Next i overridden the abstract method performFunction().


//*****************

In Room class ->
I created a class Room, and i created private instance variable(roomname), and used aggregation - declared device1 and device2 {in datatype smartdevice} and then i use getter method for the each variable.
I created a constructor and initialized the each instance variable and assigned to instance variable  by using this keyword.
Then created a two methods showRoomDevices() and controlDevice(), to display roomname, 2 device names, and performfunction.


//*****************

In House class ->
Created a class House and declared two aggregate variable room1 and room2 from the class Room
Created a constructor and initialized the variable(room1, room2) , and assigned the variable  by using {this} keyword.
Then created a two methods showAllDevices() and controlAllDevice(), to display showRoomDevices() and controlDevice() for each room (room1, room2).

//*****************

In main class->
Created a 2 object each, for Light, Thermostat and passes the parameters.
And then Created a 2 object for Room and passes the roomname and 2 device {as a object reference for light, thermostat}.
Then created a object for House with reference h1 and called the method showAllDevices() and controlAllDevice() to display the details.

//*********************

oops concept used ->

-> Hierarchy inheritance
-> Abstract class - method override
-> Aggregation

//************************

Output ->

Room :Living Room
Device :Living Room Light
Device :Living Room Thermostat


Room :BedRoom
Device :BedRoom Light
Device :BedRoom Thermostat

 ----- Performing Functions -----
1. Light 'Living Room Light' is adjusting brightness to 75%
2. Thermostat 'Living Room Thermostat' is set to 22.5°C
1. Light 'BedRoom Light' is adjusting brightness to 60% 
2. Thermostat 'BedRoom Thermostat' is set to 25.5°C

//*********************  END   ********************

