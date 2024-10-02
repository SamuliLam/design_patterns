package chain_of_responsibility;

public class CompensationRequestHandler extends Handler{
    @Override
    public void handleMessage(Message request) {
        if (request.getMessageType() == Message.MessageType.COMPENSATION_REQUEST) {
            System.out.println("Compensation request handler is handling the request");
            System.out.println("Compensation request: " + request.getMessageContent());
            System.out.println("Sender email: " + request.getSenderEmail());
            System.out.println("Compensation request handler finished handling the request"+ "\n");
        } else {
            System.out.println("Compensation request handler cannot handle the request type " + request.getMessageType()+ ", passing it to the next handler" + "\n");
            passToNextHandler(request);
        }
    }
}
