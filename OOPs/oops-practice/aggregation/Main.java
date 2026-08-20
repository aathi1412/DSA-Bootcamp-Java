package oops.aggregation;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department("cse", "aathi");
        Department d2 = new Department("it", "senti");

        Department[] d = {d1, d2};
        student s = new student("bala", 006, d);
        s.showstudent();
    }
}
