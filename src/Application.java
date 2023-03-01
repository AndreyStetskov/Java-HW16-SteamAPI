import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void start(){
        System.out.println("Welcome to our movie directory!");
        System.out.println();
        System.out.println("What do you want to do? Enter 'help' to display a functionality of the app.");

        functional();

        System.out.println("Thanks you a lot for using our directory! Come back else!");
        System.out.println();
        System.out.println("Bye, bye! Have a great day!");
    }


    public static void functional() {
        Set<Film> list = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        String choose = scan.nextLine();

        while (!choose.equals("exit")) {
            switch (choose) {
                case "help" -> {
                    System.out.println("Enter the following to start using:");
                    System.out.println("Enter '1' to add a new film");
                    System.out.println("Enter '2' to remove some film");
                    System.out.println("Enter '3' to update a description film");
                    System.out.println("Enter '4' to find some film");
                    System.out.println("Enter 'exit' to exit the application");
                }
                case "1" -> FilmDirectory.add(list);
                case "2" -> FilmDirectory.remove(list);
                case "3" -> FilmDirectory.updatingInformation(list);
                case "4" -> FilmDirectory.search(list);
                default -> System.out.println("The command is uncorrected");
            }
            System.out.println("What do you want to do else? Enter 'help' to display a functionality of the app.");
            functional();
        }
    }
}
