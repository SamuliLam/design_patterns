package mediator;

import javafx.application.Application;
import javafx.stage.Stage;

public class ChatApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Mediator mediator = new ChatRoomMediator();

        ChatClient client1 = new ChatClient("Stefanos", mediator);
        ChatClient client2 = new ChatClient("Ismet", mediator);
        ChatClient client3 = new ChatClient("Himo", mediator);

        client1.display();
        client2.display();
        client3.display();
    }

}
