package oops.aggregation;

public class student {
    private String stu_name;
    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
//************** */
    private int roll_no;
    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
//*********** */
    private Department[] dept;
    public Department[] getDept() {
        return dept;
    }

    public void setDept(Department[] dept) {
        this.dept = dept;
    }
//********* */
    public student(String stu_name, int roll_no, Department[] dept){
        this.stu_name = stu_name;
        this.roll_no = roll_no;
        this.dept = dept;
     }

     public void showstudent(){
        System.out.println("student name :"+ getStu_name());
        System.out.println("roll nio :" + getRoll_no());
        for (Department department : dept) {
            department.show_dept_details();
        }
        
     }
}
