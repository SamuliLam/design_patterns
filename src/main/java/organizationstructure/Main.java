package organizationstructure;

public class Main {

    public static void main(String[] args) {

        Department organization = new Department("Organization");
        Department department1 = new Department("Department 1");

        Employee employee1 = new Employee("Employee 1", 5000);
        Employee employee2 = new Employee("Employee 2", 6000);

        department1.add(employee1);
        department1.add(employee2);

        organization.add(department1);

        Department department2 = new Department("Department 2");

        Employee employee3 = new Employee("Employee 3", 7000);

        department2.add(employee3);
        organization.add(department2);

        System.out.println("Total salary: " + organization.getSalary());
        System.out.println(organization.toXML(0));
    }
}
