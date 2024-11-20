package prototype;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Recommendation scienceFiction = new Recommendation("Science Fiction Fans");
        scienceFiction.addRecommendation(new Book("Dune", "Frank Herbert", "Science Fiction"));
        scienceFiction.addRecommendation(new Book("Ender's Game", "Orson Scott Card", "Science Fiction"));

        System.out.println("Welcome to the Book Recommendation System!");
        System.out.println("Here are the initial recommendations:");
        System.out.println(scienceFiction);

        Recommendation clonedRecommendation = scienceFiction.clone();
        clonedRecommendation.setTargetAudience("Space Opera Enthusiasts");
        clonedRecommendation.addRecommendation(new Book("Foundation", "Isaac Asimov", "Science Fiction"));

        System.out.println("\nCloned and customized recommendations for a new audience:");
        System.out.println(clonedRecommendation);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Current Recommendations");
            System.out.println("2. Create a Clone of the Recommendation");
            System.out.println("3. Add a Book to the Cloned Recommendation");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nOriginal Recommendation:");
                    System.out.println(scienceFiction);
                    System.out.println("Cloned Recommendation:");
                    System.out.println(clonedRecommendation);
                    break;
                case 2:
                    System.out.println("\nCreating a fresh clone of the original recommendation...");
                    clonedRecommendation = scienceFiction.clone();
                    System.out.println("Newly cloned recommendation:");
                    System.out.println(clonedRecommendation);
                    break;
                case 3:
                    System.out.println("\nEnter the details of the book to add:");
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();

                    clonedRecommendation.addRecommendation(new Book(title, author, genre));
                    System.out.println("\nBook added! Updated cloned recommendation:");
                    System.out.println(clonedRecommendation);
                    break;
                case 4:
                    System.out.println("\nThank you for using the Book Recommendation System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
