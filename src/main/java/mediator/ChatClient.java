package mediator;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClient {
    private final String username;
    private final Mediator mediator;

    private TextArea chatArea;
    private TextField messageField;
    private TextField recipientField;

    public ChatClient(String username, Mediator mediator) {
        this.username = username;
        this.mediator = mediator;
        mediator.addClient(this);
    }

    public String getUsername() {
        return username;
    }

    public void display() {
        Stage stage = new Stage();
        stage.setTitle("Chat " + username);

        chatArea = new TextArea();
        chatArea.setEditable(false);

        messageField = new TextField();
        messageField.setPromptText("Enter your message");

        recipientField = new TextField();
        recipientField.setPromptText("Enter recipient username");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> sendMessage());

        VBox layout = new VBox(10, chatArea, recipientField, messageField, sendButton);
        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public void sendMessage() {
        String message = messageField.getText();
        String recipient = recipientField.getText();

        if (!message.isEmpty() && !recipient.isEmpty()) {
            mediator.sendMessage(message, username, recipient);
            messageField.clear();
        }
    }

    public void receiveMessage(String sender, String message) {
        chatArea.appendText(sender + ": " + message + "\n");
    }
}
