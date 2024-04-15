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
        System.out.println("Do you want to see the whole list of movies or do you want to choose? \nPress 1 to view the whole list. Press 2 to view individually");
        System.out.println("And! If you know the Id of the movie you can try to find it here: ");
        System.out.println("To do this, press 3");
        int x = scanner.nextInt();
        if (x == 1) {
            printMoviesDetails2(movies);
        }
        if (x == 2) {
            System.out.println("What kind of movie are you interested in?");
            System.out.println("#1 - Matrix, #2 - One Flew Over the Cuckoo's Nest, #3 - Mr. Bean, #4 - 300");
            printMovieDetails(movies);
        }
        if (x == 3) {
            System.out.println("Enter the Id of the movie (for example: 54214) ");

            findMovieById(movies);

        }
    }

    public static void printMovieDetails(HashMap<Integer, Movie> movies) {
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(1).getTitle(), movies.get(1).getGenre(), movies.get(1).getPrice(), movies.get(1).getProductId());
        }
        if (choice == 2) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(2).getTitle(), movies.get(2).getGenre(), movies.get(2).getPrice(), movies.get(2).getProductId());
        }
        if (choice == 3) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(3).getTitle(), movies.get(3).getGenre(), movies.get(3).getPrice(), movies.get(3).getProductId());
        }
        if (choice == 4) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(4).getTitle(), movies.get(4).getGenre(), movies.get(4).getPrice(), movies.get(4).getProductId());
        }
        if (choice == 5) {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(5).getTitle(), movies.get(5).getGenre(), movies.get(5).getPrice(), movies.get(5).getProductId());
        }

    }

    private void printMoviesDetails2(HashMap<Integer, Movie> movies) {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(1).getTitle(), movies.get(1).getGenre(), movies.get(1).getPrice(), movies.get(1).getProductId());
        System.out.println("---");
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(2).getTitle(), movies.get(2).getGenre(), movies.get(2).getPrice(), movies.get(2).getProductId());
        System.out.println("---");
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(3).getTitle(), movies.get(3).getGenre(), movies.get(3).getPrice(), movies.get(3).getProductId());
        System.out.println("---");
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(4).getTitle(), movies.get(4).getGenre(), movies.get(4).getPrice(), movies.get(4).getProductId());
        System.out.println("---");
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d $ \nProductId: %d\n", movies.get(5).getTitle(), movies.get(5).getGenre(), movies.get(5).getPrice(), movies.get(5).getProductId());
    }

    public static void findMovieById(HashMap<Integer, Movie> movies) {

        long c = scanner.nextLong();
        long foundKey = 0;
        for (int key : movies.keySet()) {
            if (c == movies.get(key).getProductId()) {
                foundKey = key;
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $", movies.get(key).getTitle(), movies.get(key).getGenre(), movies.get(key).getPrice());
            }

        }
        if (foundKey == 0){
            System.out.println("Seriously? And where should I look for a movie with that ID? " + c + " - It's not here!");
        }
    }
}
