package visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private List<String> searchResults;
    private String searchName;


    public SearchVisitor(String searchName) {
        this.searchResults = new ArrayList<>();
        this.searchName = searchName;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchName)) {
            searchResults.add(file.getName());
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }
    }

    public List<String> getSearchResults() {
        return searchResults;
    }


}
