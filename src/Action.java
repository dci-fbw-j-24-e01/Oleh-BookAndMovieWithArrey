import java.util.Scanner;

public class Action {
    public Action() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to see? Books or movies?");
        System.out.println("Press 1 to go to Books or 2 to go to Movies. ");
        int x = scanner.nextInt();
        if(x ==1)

        {
            new AddBook();
        }
        if(x ==2){

            new AddMovie();
        }
    }
}