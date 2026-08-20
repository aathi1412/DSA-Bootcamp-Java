package oops.Attendance;

public abstract class Person {
    private String Name;
    //********* */
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    private int Id;
//************** */
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    //******* */

    Person(String name, int id){
        this.Name = name;
        this.Id = id;
    }
    //88888888888888
    
    abstract void showdetails();
}
