package oops.library;

public abstract class Item {
    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
// *******************************

    Item(String title, String author){
        this.title = title;
        this.author = author;
    }

    abstract void display();

    //  System.out.println("title is:" + title);
    //     System.out.println("Author is:"+ author);
}
