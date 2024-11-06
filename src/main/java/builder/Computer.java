package builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Component> components;

    public Computer() {
        this.components = new ArrayList<>();
    }

    public List<Component> getComponents() {
        return this.components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
