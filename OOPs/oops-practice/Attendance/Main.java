package oops.Attendance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AttendanceEmployee[] p1 = new AttendanceEmployee[3];
        
        for(int i=0;i<p1.length;i++){
            System.out.println("Enter details for Employee "+(i+1));
            System.out.print("Enter Name: ");
            String name=s.nextLine();
            System.out.print("Enter ID: ");
            int id=s.nextInt();
            s.nextLine(); 
            System.out.print("Enter Department: ");
            String department=s.nextLine();
            System.out.println("Enter Attendance (7 values of 0/1): ");
            p1[i]=new AttendanceEmployee(name, id, department);
            p1[i].markAttendance();
        } 
        for(AttendanceEmployee emp :p1){
            System.out.println();
            emp.showdetails();
            emp.displayAttendance();
        }
        Employee.showEmployeeCount();

        s.close();
    }
    
}
