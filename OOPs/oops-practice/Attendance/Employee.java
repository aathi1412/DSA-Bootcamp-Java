package oops.Attendance;

public class Employee extends Person{
    //************** */
    private String Department;
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    //****************** */
    static int employeeCount;

    //*************** */
    Employee(String Name, int id, String Department){
        super(Name, id);
        this.Department = Department;
        employeeCount++;
    }

    //******************* */
    public static void showEmployeeCount(){
        System.out.println("employee count:" + employeeCount);
    }

    @Override
    void showdetails() {
        System.out.println("Name: "+ getName());
        System.out.println("Id: "+ getId());
        System.out.println("Department: "+ getDepartment());
    }
}
