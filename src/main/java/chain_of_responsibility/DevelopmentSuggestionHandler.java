package chain_of_responsibility;

public class DevelopmentSuggestionHandler extends Handler{
    @Override
    public void handleMessage(Message request) {
        if (request.getMessageType() == Message.MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Development suggestion handler is handling the request");
            System.out.println("Development suggestion: " + request.getMessageContent());
            System.out.println("Sender email: " + request.getSenderEmail());
            System.out.println("Development suggestion handler finished handling the request" + "\n");
        } else {
            System.out.println("Development suggestion handler cannot handle the request type " + request.getMessageType()+ ", passing it to the next handler" + "\n");
            passToNextHandler(request);
        }
    }
}
