package koeharjoitukset.factorymethod;

public class SheepCreator extends AnimalCreator {
    @Override
    public Animal createAnimal(){
        return new Sheep();
    }
}
