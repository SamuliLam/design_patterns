package builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer gamingComputer;

    public GamingComputerBuilder() {
        this.reset();
    }

    @Override
    public void buildProcessor() {
        gamingComputer.addComponent(new Component("Intel Core i9-9900K"));
    }

    @Override
    public void buildRAM() {
        gamingComputer.addComponent(new Component("32GB DDR4 RAM"));
    }

    @Override
    public void buildHardDrive() {
        gamingComputer.addComponent(new Component("1TB SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        gamingComputer.addComponent(new Component("NVIDIA GeForce RTX 2080 Ti"));
    }

    @Override
    public void buildOperatingSystem() {
        gamingComputer.addComponent(new Component("Windows 10 Pro"));
    }

    @Override
    public void reset() {
        this.gamingComputer = new Computer();
    }

    @Override
    public Computer getResult() {
        return this.gamingComputer;
    }
}
