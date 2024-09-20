package state;

import java.sql.SQLOutput;

public class ExpertLevelState extends State{
    public ExpertLevelState(Character character) {
        super(character);
    }

    public void action() {

        System.out.println("Name: " + this.getCharacter().getName());
        System.out.println("XP: " + this.getCharacter().getExp());
        System.out.println("Health: " + this.getCharacter().getHealthPoints());


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
                break;
        }

    }
}
