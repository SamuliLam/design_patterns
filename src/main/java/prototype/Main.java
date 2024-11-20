package prototype;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Recommendation recommendation = new Recommendation("Children");
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupéry", "Fiction");
        Book book2 = new Book("The Very Hungry Caterpillar", "Eric Carle", "Children's literature");
        recommendation.addRecommendation(book1);
        recommendation.addRecommendation(book2);

        Recommendation clone = recommendation.clone();
        System.out.println("Recommendation: " + recommendation.getTargetAudience());
        for (Book book : recommendation.getRecommendations()) {
            System.out.println("Book: " + book.getTitle());
        }

        System.out.println("Clone: " + clone.getTargetAudience());
        for (Book book : clone.getRecommendations()) {
            System.out.println("Book: " + book.getTitle());
        }
    }
}
