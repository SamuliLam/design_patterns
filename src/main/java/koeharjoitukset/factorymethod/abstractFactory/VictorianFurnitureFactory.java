package koeharjoitukset.factorymethod.abstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Couch createCouch() {
        return new VictorianCouch();
    }
}
