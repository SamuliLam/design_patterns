package proxy;

import java.util.Date;
import java.util.HashMap;

public class Library {
    private HashMap<Integer, IDocument> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(IDocument document) {
        documents.put(document.getId(), document);
    }

    public IDocument getDocument(int documentId) {
        return documents.get(documentId);
    }

    public void createDocument(int id, Date created, String content) {
        Document document = new Document(id, created, content);
        addDocument(document);
    }

    public void createProtectedDocument(int id, Date created, String content, String username) {
        Document document = new Document(id, created, content);
        DocumentProxy documentProxy = new DocumentProxy(document);
        AccessControlService.getInstance().addPermission(id, username);
        addDocument(documentProxy);
    }
}
