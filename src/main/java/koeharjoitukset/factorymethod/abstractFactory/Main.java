package koeharjoitukset.factorymethod.abstractFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Chair victorianChair = victorianFurnitureFactory.createChair();
        Couch victorianCouch = victorianFurnitureFactory.createCouch();
    }
}
