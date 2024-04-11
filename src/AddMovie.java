import java.util.HashMap;
import java.util.Scanner;

public class AddMovie {
    static Scanner scanner = new Scanner(System.in);

    public AddMovie() {


        HashMap<Integer, Movie> movies = new HashMap<>();
        movies.put(1, new Movie("Matrix", MovieGenre.ACTION, 10, 123554));
        movies.put(2, new Movie("One Flew Over the Cuckoo's Nest", MovieGenre.DRAMA, 10000, 54214));
        movies.put(3, new Movie("Mr. Bean", MovieGenre.COMEDY, 1000, 6554125));
        movies.put(4, new Movie("300", MovieGenre.DOCUMENTARY, 21, 554812));
        movies.put(5, new Movie("The Prestige", MovieGenre.DETECTIVE, 150, "Christopher Nolan", 11201));

        printMovieDetails(movies);
    }

    public static void printMovieDetails(HashMap<Integer, Movie> movies) {
        int choice = scanner.nextInt();
        if (choice == 1) {

            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d", movies.get(1).getTitle(), movies.get(1).getGenre(), movies.get(1).getPrice(), movies.get(1).getProductId());
        }
        if (choice == 2) {
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d", movies.get(2).getTitle(), movies.get(2).getGenre(), movies.get(2).getPrice(), movies.get(2).getProductId());
        }
        if (choice == 3) {
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d", movies.get(3).getTitle(), movies.get(3).getGenre(), movies.get(3).getPrice(), movies.get(3).getProductId());
        }
        if (choice == 4) {
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d", movies.get(4).getTitle(), movies.get(4).getGenre(), movies.get(4).getPrice(), movies.get(4).getProductId());
        }
//    public static void findMovieById (){
//
//    }
    }
}