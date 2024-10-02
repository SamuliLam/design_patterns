package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler contactRequestHandler = new ContactRequestHandler();
        Handler compensationRequestHandler = new CompensationRequestHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();
        Handler developmentSuggestionHandler = new DevelopmentSuggestionHandler();

        contactRequestHandler.setNextHandler(generalFeedbackHandler).setNextHandler(compensationRequestHandler).setNextHandler(developmentSuggestionHandler);

        Message contactRequest = new Message("I would like to contact you", "stefanos@gmail.com", Message.MessageType.CONTACT_REQUEST);
        Message compensationRequest = new Message("I would like to request compensation", "stefanos@gmail.com", Message.MessageType.COMPENSATION_REQUEST);
        Message generalFeedback = new Message("I would like to give you some feedback", "stefanos@gmail.com", Message.MessageType.GENERAL_FEEDBACK);
        Message developmentSuggestion = new Message("I would like to suggest a new feature", "stefanos@gmail.com", Message.MessageType.DEVELOPMENT_SUGGESTION);

        contactRequestHandler.handleMessage(contactRequest);
        contactRequestHandler.handleMessage(generalFeedback);
        contactRequestHandler.handleMessage(compensationRequest);
        contactRequestHandler.handleMessage(developmentSuggestion);

    }
}
