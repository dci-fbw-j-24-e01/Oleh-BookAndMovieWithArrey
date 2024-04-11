import java.util.Scanner;

public class Action {
    public Action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to see? Books or movies?");
        System.out.println("Press 1 to go to Books or 2 to go to Movies. ");
        int x = scanner.nextInt();
        if(x ==1)

        {
            System.out.println("What kind of book are you interested in?");
            System.out.println("#1 - Starship Troopers, #2 - Stranger in a Strange Land, #3 - The Hobbit");
            new AddBook();
        }
        if(x ==2)

        {
            System.out.println("What kind of movie are you interested in?");
            System.out.println("#1 - Matrix, #2 - One Flew Over the Cuckoo's Nest, #3 - Mr. Bean, #4 - 300");
            new AddMovie();
        }
    }
}