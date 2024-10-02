package chain_of_responsibility;

public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handleMessage(Message request) {
        if (request.getMessageType() == Message.MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback handler is handling the request");
            System.out.println("General feedback: " + request.getMessageContent());
            System.out.println("Sender email: " + request.getSenderEmail());
            System.out.println("General feedback handler finished handling the request" + "\n");
        } else {
            System.out.println("General feedback handler cannot handle the request type " + request.getMessageType()+ ", passing it to the next handler" + "\n");
            passToNextHandler(request);
        }
    }
}
