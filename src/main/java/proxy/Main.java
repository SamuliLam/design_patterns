package proxy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("user1");
        User user2 = new User("user2");

        library.createDocument(1, new Date(), "Document 1 for all users");
        library.createProtectedDocument(2, new Date(), "Document 2 created for user1", "user1");
        library.createProtectedDocument(3, new Date(), "Document 3 created for user2", "user2");

        // Every user should have access to document 1
        System.out.println("user1 reading document1: " + library.getDocument(1).getContent(user2));
        System.out.println("user2 reading document1: " + library.getDocument(1).getContent(user2));

        // user2 should not have access to document 2
        try {
            System.out.println("Document 2 content: " + library.getDocument(2).getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println("Trying to access Document 2 content as user2: Access denied");
        }

        // user1 should have access to document 2
        System.out.println("user1 reading document2: " + library.getDocument(2).getContent(user1));

        // user2 should have access to document 3
        System.out.println("user2 reading document3: " + library.getDocument(3).getContent(user2));



    }
}
