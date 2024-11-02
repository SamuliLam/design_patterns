package proxy;

import java.util.Date;

public interface IDocument {
    int getId();
    String getCreated();
    String getContent(User user);
}
