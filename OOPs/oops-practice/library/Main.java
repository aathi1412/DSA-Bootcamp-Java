package oops.library;

public class Main {
    public static void main(String[] args) {
        // Book book = new Book("eee", "rrr", "ttt")
        // Borrowed_book b = new Borrowed_book("title", "author", "genre", "aathi", "12/12/2002");
        // Borrowed_book b1 = new Borrowed_book("title", "author", "genre", "adi", "02/02/2002");
       Item[] I = new Item[3];
        I[0] = new Book("eee", "rrr", "ttt");
        I[1] = new Book("eee", "rrr", "ttt");
        I[2] = new Borrowed_book("title", "author", "genre", "adi", "02/02/2002");

        for (Item item : I) {
            System.out.println();
            item.display();
        }

        //  System.out.println();
        // b.display();
        // System.out.println();
        // b1.display();
        //  System.out.println();
        // b.instruction();
    }

    
}
