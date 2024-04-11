import java.util.HashMap;
import java.util.Scanner;

public class AddBook {
    static Scanner scanner = new Scanner(System.in);

    public AddBook() {

        HashMap<Integer, Book> books = new HashMap<>();
        books.put(1, new Book("Starship Troopers", "Robert A. Heinlein", 10));
        books.put(2, new Book("Stranger in a Strange Land", "Robert A. Heinlein", 20));
        books.put(3, new Book("The Hobbit", "J. R. R. Tolkien", 15));

       printBookDetails();
    }

    private static void printBookDetails() {
        int choice = scanner.nextInt();
        if (choice== 1 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", Book.getTitle(), Book.getAuthor(), Book.getPrice());
        }
        if (choice== 2 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", Book.getTitle(), Book.getAuthor(), Book.getPrice());
        }
        if (choice== 3 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", Book.getTitle(), Book.getAuthor(), Book.getPrice());
        }
    }


}
