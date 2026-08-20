package oops.library;

//import java.sql.Date;

public class Borrowed_book extends Book {
    private String borrower_name;
    public String getBorrower_name() {
        return borrower_name;
    }

    public void setBorrower_name(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    private String due_date;

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    Borrowed_book(String title, String author, String genre, String borrower_name, String due_date){
        super(title, author, genre);
        this.borrower_name = borrower_name;
        this.due_date = due_date;
    }
   

    void display(){
        super.display();

        System.out.println("borrower name is:" + getBorrower_name());
        System.out.println("due date is :" + getDue_date());
    }
}
