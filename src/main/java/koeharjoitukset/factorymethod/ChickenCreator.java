package koeharjoitukset.factorymethod;

public class ChickenCreator extends AnimalCreator {
    @Override
    public Animal createAnimal(){
        return new Chicken();
    }
}
