package oops.COLLEGE;

public class college {
    static int code=1000;
    String clg_name;
    int clg_code;
    
    college(String clg_name){
        this.clg_code= code++;
        this.clg_name = clg_name;
        
    }
    public void display(){
        System.out.println("college name:" + clg_name);
        System.out.println("college code:" + clg_code);
        
    }
}
