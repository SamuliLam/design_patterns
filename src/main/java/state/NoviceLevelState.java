package state;

public class NoviceLevelState extends State {

    public NoviceLevelState(Character character) {
        super(character);
    }

    public void action() {
        System.out.println("Name: " + this.getCharacter().getName());
        System.out.println("XP: " + this.getCharacter().getExp());
        System.out.println("Health: " + this.getCharacter().getHealthPoints());

        String[] options = {"Train"};

        final int XP_TO_INTERMEDIATE = 100;



        if (this.getCharacter().readCharacterOptions(options) == 1) {
            this.getCharacter().train();
            if (this.getCharacter().getExp() >= XP_TO_INTERMEDIATE) {
                System.out.println("You have reached the required XP to reach Intermediate Level.");
                this.getCharacter().setLevel(new IntermediateLevelState(this.getCharacter()));
                System.out.println("Your character is now at Intermediate Level.");
                System.out.println("You gained the ability to meditate. Meditating will increase your HP.");
            }
        }

    }
}

