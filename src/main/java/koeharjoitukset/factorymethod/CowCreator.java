package koeharjoitukset.factorymethod;

public class CowCreator extends AnimalCreator{
    @Override
    public Animal createAnimal(){
        return new Cow();
    }
}
