package builder;

public class ComputerDirector {
    ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void makeGamingComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRAM();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
    }

    public void makeOfficeComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRAM();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
    }
}
