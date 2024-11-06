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




    }
}
