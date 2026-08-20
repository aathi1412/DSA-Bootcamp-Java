package oops.COLLEGE;

public class Dept extends student {
    String dept;
    Dept( String clg_name, String std_name, int reg_no, String dept){
        super( std_name, clg_name, reg_no);
        this.dept = dept;
    }
    public void display(){
        super.display();
        System.out.println("dept :" + dept);
    }
    
}
