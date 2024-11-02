package proxy;

public class DocumentProxy implements IDocument {
    private final IDocument document;


    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (!AccessControlService.getInstance().isAllowed(getId(), user.getUsername())) {
            throw new AccessDeniedException("Access denied");
        } else {
            return document.getContent(user);
        }
    }

    @Override
    public int getId() {
        return document.getId();
    }

    @Override
    public String getCreated() {
        return document.getCreated();
    }
}
