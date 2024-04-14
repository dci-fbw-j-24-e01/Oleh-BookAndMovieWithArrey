import java.util.HashMap;
import java.util.Scanner;

public class AddBook {
    static Scanner scanner = new Scanner(System.in);

    public AddBook() {

        HashMap<Integer, Book> books = new HashMap<>();
        books.put(1, new Book("Starship Troopers", "Robert A. Heinlein", 10));
        books.put(2, new Book("Stranger in a Strange Land", "Robert A. Heinlein", 20));
        books.put(3, new Book("The Hobbit", "J. R. R. Tolkien", 15));
        System.out.println("Do you want to see the whole list of books or do you want to choose? \nPress 1 to view the whole list. Press 2 to view individually");
        int x = scanner.nextInt();
        if (x == 1) {
            printBookDetails2(books);
        }
        if (x == 2) {
            System.out.println("What kind of book are you interested in?");
            System.out.println("#1 - Starship Troopers, #2 - Stranger in a Strange Land, #3 - The Hobbit");
            printBookDetails(books);
        }
    }

    private static void printBookDetails(HashMap<Integer, Book> books) {
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \n", books.get(1).getTitle(), books.get(1).getAuthor(), books.get(1).getPrice());
        }
        if (choice == 2) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \n", books.get(2).getTitle(), books.get(2).getAuthor(), books.get(2).getPrice());
        }
        if (choice == 3) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \n", books.get(3).getTitle(), books.get(3).getAuthor(), books.get(3).getPrice());
        }
    }

    private void printBookDetails2(HashMap<Integer, Book> books) {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \n", books.get(1).getTitle(), books.get(1).getAuthor(), books.get(1).getPrice());
        System.out.println("---");
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \n", books.get(2).getTitle(), books.get(2).getAuthor(), books.get(2).getPrice());
        System.out.println("---");
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \n", books.get(3).getTitle(), books.get(3).getAuthor(), books.get(3).getPrice());
    }

}
