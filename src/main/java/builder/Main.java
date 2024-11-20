package builder;

public class Main {
    public static void main(String[] args) {

        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(gamingComputerBuilder);
        computerDirector.makeGamingComputer();
        Computer gamingComputer = gamingComputerBuilder.getResult();
        System.out.println("Gaming Computer components:");
        for (Component component : gamingComputer.getComponents()) {
            System.out.println(component.getName());
        }


        OfficeComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector officeComputerD = new ComputerDirector(officeComputerBuilder);
        officeComputerD.makeOfficeComputer();
        Computer officeComputer = officeComputerBuilder.getResult();
        System.out.println("Office Computer components:");
        for (Component component : officeComputer.getComponents()) {
            System.out.println(component.getName());
        }



    }
}
