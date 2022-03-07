package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        runMovies();
    }

    public static void runMovies() {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category");
        int userInput = Input.getInt("\nEnter your choice: ");

        userInputFilter(userInput);

    }

    public static void userInputFilter(Integer userInput) {

        switch (userInput) {
            case 0: System.out.println("Goodbye!");
                break;
            case 1: displayMovies("all");
                break;
            case 2: displayMovies("animated");
                break;
            case 3: displayMovies("drama");
                break;
            case 4: displayMovies("horror");
                break;
            case 5: displayMovies("scifi");
                break;
            default:
                System.out.println("PLEASE ENTER A NUMBER DISPLAYED IN THE MENU\n");
                runMovies();
                break;
        }
    }

    // display movies
    public static void displayMovies(String category) {

        System.out.printf("You selected \"%s\"\nBelow are your results\n", category);

        int count = 0;
        for (int i = 0; i < MoviesArray.findAll().length; i++) {
            if (category.equalsIgnoreCase(MoviesArray.findAll()[i].category) || category.equalsIgnoreCase("all")) {
                count += 1;
                System.out.printf("%d: %s -- %s\n", count, MoviesArray.findAll()[i].name, MoviesArray.findAll()[i].category);
            }
        }
        System.out.printf("End of results (Total results: %d)\n", count);
        runMovies();
    }
}
