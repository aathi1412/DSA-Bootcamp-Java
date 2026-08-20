package oops.COLLEGE;

public class student extends college{
    int reg_no;
    String std_name;

    student( String std_name,String clg_name, int reg_no){
        super( clg_name);
        this.std_name = std_name;
        this.reg_no = reg_no;
    }
    public void display(){
        super.display();
        System.out.println("student name:" + std_name);
        System.out.println("register no:" + reg_no);
    }
}
