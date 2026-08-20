package oops.aggregation;

public class Department {
   private String deptName;
    public String getDeptName() {
    return deptName;
}

   public void setDeptName(String deptName) {
    this.deptName = deptName;
   }

    private String hodName;

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public Department(String deptName, String hodName){
        this.deptName = deptName;
        this.hodName = hodName;
     }
     
     public void show_dept_details(){
        System.out.println("dept name :"+ getDeptName());
        System.out.println("hodName :"+ getHodName());
     }

}
