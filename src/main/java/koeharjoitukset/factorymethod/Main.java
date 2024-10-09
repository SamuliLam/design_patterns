package koeharjoitukset.factorymethod;

public class Main {
    public static void main(String[] args) {
        AnimalCreator sheepCreator = new SheepCreator();
        AnimalCreator cowCreator = new CowCreator();
        AnimalCreator chickenCreator = new ChickenCreator();

        Animal sheep = sheepCreator.createAnimal();
        Animal cow = cowCreator.createAnimal();
        Animal chicken = chickenCreator.createAnimal();

        System.out.println("Sheep makes sound " + sheep.makeSound());
        System.out.println("Cow makes sound " + cow.makeSound());
        System.out.println("Chicken makes sound " + chicken.makeSound());
    }
}
