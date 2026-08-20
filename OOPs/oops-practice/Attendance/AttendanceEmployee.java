package oops.Attendance;

import java.util.Arrays;
import java.util.Scanner;

public class AttendanceEmployee extends Employee implements Markable{
     Scanner s = new Scanner(System.in);
    //***************** */
     private int[] attendanceArray;


    /***************** */
    AttendanceEmployee(String Name, int Id, String Department){
        super(Name, Id, Department);
        this.attendanceArray = new int[7];;
    }

   @Override
   public void markAttendance() {
    for (int i = 0; i < attendanceArray.length; i++) {
        
        attendanceArray[i] = s.nextInt() ;
    }
       
   }
   @Override
   public int calculatePresentDays() {
    
    int presentcount = 0;
   for (int i : attendanceArray) {
      if (i == 1) {
        presentcount++;
      }
   }
       return presentcount;
   }

   public void displayAttendance(){
    System.out.println("Attendance :" + Arrays.toString(attendanceArray) );
    System.out.println("present days" + calculatePresentDays());
    
   }
   
}
