package builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer officeComputer;
    @Override
    public void buildProcessor() {
        officeComputer.addComponent(new Component("Intel Core i5-9400F"));
    }

    @Override
    public void buildRAM() {
        officeComputer.addComponent(new Component("16GB DDR4 RAM"));
    }

    @Override
    public void buildHardDrive() {
        officeComputer.addComponent(new Component("512GB SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        officeComputer.addComponent(new Component("Integrated Graphics"));
    }

    @Override
    public void buildOperatingSystem() {
        officeComputer.addComponent(new Component("Windows 10 Home"));
    }

    @Override
    public Computer getResult() {
        return this.officeComputer;
    }

    @Override
    public void reset() {
        this.officeComputer = new Computer();
    }
}
