package koeharjoitukset.factorymethod.abstractFactory;

public class NormalFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair(){
        return new NormalChair();
    }
    @Override
    public Couch createCouch(){
        return new NormalCouch();
    }
}
