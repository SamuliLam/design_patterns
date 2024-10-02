package chain_of_responsibility;

public class ContactRequestHandler extends Handler{
    @Override
    public void handleMessage(Message request) {
        if (request.getMessageType() == Message.MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request handler is handling the request");
            System.out.println("Contact request: " + request.getMessageContent());
            System.out.println("Sender email: " + request.getSenderEmail());
            System.out.println("Contact request handler finished handling the request" + "\n");
        } else {
            System.out.println("Contact request handler cannot handle the request type " + request.getMessageType()+ ", passing it to the next handler" + "\n");
            passToNextHandler(request);
        }
    }
}
