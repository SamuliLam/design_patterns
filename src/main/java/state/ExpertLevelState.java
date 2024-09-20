package state;

import java.sql.SQLOutput;

public class ExpertLevelState extends State{
    public ExpertLevelState(Character character) {
        super(character);
    }

    public void action() {
        System.out.println("Your character is at Expert Level.");
        System.out.println("You gained the ability to fight. Fighting will greatly increase your XP but you will lose HP.");

        String [] options = {"Train", "Meditate", "Fight"};
        final int XP_TO_MASTER = 500;

        switch (this.getCharacter().readCharacterOptions(options)) {
            case 1:
                if (this.getCharacter().getExp() >= XP_TO_MASTER) {
                    System.out.println("You have reached the required XP to reach Master Level.");
                    this.getCharacter().setLevel(new MasterLevelState(this.getCharacter()));
                    break;
                }
                this.getCharacter().train();
                break;
            case 2:
                this.getCharacter().meditate();
                break;
            case 3:
                this.getCharacter().fight();
                if (this.getCharacter().getExp() >= XP_TO_MASTER) {
                    System.out.println("You have reached the required XP to reach Master Level.");
                    this.getCharacter().setLevel(new MasterLevelState(this.getCharacter()));
                    break;
                }
                if(this.getCharacter().getHealthPoints() <= 0){
                    System.out.println("YOU DIED.");
                    break;
                }
                System.out.println("You gained XP. Your current XP is " + this.getCharacter().getExp());
                System.out.println("Fighting made you bleed. Your current HP is " + this.getCharacter().getHealthPoints());
                break;
        }

    }
}
