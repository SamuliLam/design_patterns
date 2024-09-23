package state;
import java.util.Scanner;

public class Character {

    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private State level;
    private int exp;
    private int healthPoints;

    public Character(String name) {
        this.name = name;
        level = new NoviceLevelState(this);
        healthPoints = 100;
    }

    public void play() {
        while (true) {
            if (level == null) {
                System.out.println("Character has no starting level.");
                return;
            }
            level.action();
            if(healthPoints <= 0) {
                System.out.println("You died. Restarting game.");
                setExp(0);
                setHealthPoints(100);
                level = new NoviceLevelState(this);
            }
        }
    }

    public void train() {
        System.out.println("Training...");
        this.exp += 5;
    }

    public void meditate() {
        if (this.healthPoints + 5 <= 100) {
            System.out.println("Meditating...");
            this.healthPoints += 5;
        } else {
            System.out.println("Cannot meditate. Health points are full.");
        }
    }

    public void fight() {
        System.out.println("Fighting...");
        this.healthPoints -= 10;
        this.exp += 8;
    }

    public String getName() {
        return name;
    }



    public void setLevel(State level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int readCharacterOptions(String[] options) {
        System.out.println("Choose an option:");
        System.out.println("0. to Quit");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        int choice = scanner.nextInt();
        if (choice == 0) {
            System.out.println("Game ended.");
            System.exit(0);
        }
        return choice;
    }

}
