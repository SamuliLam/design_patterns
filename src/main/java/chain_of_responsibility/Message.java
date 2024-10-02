package chain_of_responsibility;

public class Message {

    public enum MessageType {
        DEVELOPMENT_SUGGESTION,
        GENERAL_FEEDBACK,
        CONTACT_REQUEST,
        COMPENSATION_REQUEST
    }

    private String messageContent;
    private String senderEmail;
    private MessageType messageType;

    public Message(String messageContent, String senderEmail, MessageType messageType) {
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public MessageType getMessageType() {
        return messageType;
    }
}
