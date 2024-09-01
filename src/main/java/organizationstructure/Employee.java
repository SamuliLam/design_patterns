package organizationstructure;

public class Employee extends Component {
    private final double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }


    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public String toXML(int indentation) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indentation; i++) {
            sb.append(" ");
        }
        sb.append("<Employee name=\"").append(this.name).append("\" salary=\"").append(this.salary).append("\"/>\n");
        return sb.toString();
    }
}
