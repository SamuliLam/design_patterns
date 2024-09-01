package organizationstructure;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int i);

    public abstract String toXML(int indentation);


}
