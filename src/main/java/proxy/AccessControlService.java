package proxy;

import java.util.HashMap;

public class AccessControlService {
    private static AccessControlService instance;
    private HashMap<Integer, String> accessList;

    private AccessControlService() {
        accessList = new HashMap<>();
    }

    public void addPermission(int documentId, String username) {
        accessList.put(documentId, username);
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(int documentId, String username) {
        return accessList.containsKey(documentId) && accessList.get(documentId).equals(username);
    }
}
