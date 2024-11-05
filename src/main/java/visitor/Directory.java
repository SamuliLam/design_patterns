package visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        for (FileSystemElement child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(FileSystemElement child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }
}
