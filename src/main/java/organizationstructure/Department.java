package organizationstructure;

import java.util.ArrayList;
import java.util.List;

public class Department extends Component {
    private List<Component> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Component child : children) {
            totalSalary += child.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return this.children.get(i);
    }

    @Override
    public String toXML(int indentation) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indentation; i++) {
            sb.append(" ");
        }
        sb.append("<Department name=\"").append(this.name).append("\">\n");
        for (Component component : children) {
            sb.append(component.toXML(indentation + 2));
        }
        for (int i = 0; i < indentation; i++) {
            sb.append(" ");
        }
        sb.append("</Department>\n");
        return sb.toString();
    }
}
