package chain_of_responsibility;

public abstract class Handler {
    private Handler nextHandler;

    public abstract void handleMessage(Message request);

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    protected void passToNextHandler(Message request) {
        if (nextHandler != null) {
            nextHandler.handleMessage(request);
        }
    }

    public Handler getNextHandler() {
        return nextHandler;
    }
}
