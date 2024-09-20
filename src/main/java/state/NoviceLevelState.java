package state;

public class NoviceLevelState extends State {

    public NoviceLevelState(Character character) {
        super(character);
    }

    public void action() {
        String[] options = {"Train"};

        final int XP_TO_INTERMEDIATE = 100;

        System.out.println("Your character is at Novice Level.");
        System.out.println("You can train your character to increase your level.");
        System.out.println("You need 100 XP to reach Intermediate Level.");

        if (this.getCharacter().readCharacterOptions(options) == 1) {
            this.getCharacter().train();
            if (this.getCharacter().getExp() >= XP_TO_INTERMEDIATE) {
                System.out.println("You have reached the required XP to reach Intermediate Level.");
                this.getCharacter().setLevel(new IntermediateLevelState(this.getCharacter()));
            }
        }

    }
}

