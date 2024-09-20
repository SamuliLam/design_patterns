package state;

import java.util.Scanner;

public class Character {

    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private State level;
    private int exp;
    private int healthPoints;

    public Character(State level) {
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
        }
    }

    public void train() {
        this.exp += 5;
    }

    public void meditate() {
        if (this.healthPoints + 2 <= 100) {
            this.healthPoints += 2;
        } else {
            System.out.println("Cannot meditate anymore. Health points are full.");
        }
    }

    public void fight() {
        this.healthPoints -= 10;
        this.exp += 8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getLevel() {
        return level;
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
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ". " + options[i]);
        }
        int choice = scanner.nextInt();
        return choice;
    }

}
