package oops.library;

public class Book extends Item implements borrowble{
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    Book(String title, String author, String genre){
        super(title, author);
        this.genre = genre;
    }
     @Override
    public void instruction() {
        System.out.println("book vaguna thiruba tharanum without damage");
    }
    void display(){
        //super.display();
          System.out.println("title is:" + getTitle());
        System.out.println("Author is:"+ getAuthor());
        System.out.println("genre is:" + getGenre());
        //System.out.println("Author is:"+ author);
    }
}
