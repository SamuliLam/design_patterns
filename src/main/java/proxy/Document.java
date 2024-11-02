package proxy;

import java.util.Date;

public class Document implements IDocument {
    public int id;
    public Date created;

    protected String content;

    public Document(int id, Date created, String content) {
        this.id = id;
        this.created = created;
        this.content = content;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getCreated() {
        return created.toString();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        return content;
    }
}
