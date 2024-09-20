package state;

public class IntermediateLevelState extends State  {

    public IntermediateLevelState(Character character) {
        super(character);
    }

    public void action() {
        System.out.println("Your character is at Intermediate Level.");
        System.out.println("You gained the ability to meditate. Meditating will increase your HP.");

        final int XP_TO_EXPERT = 300;
        String [] options = {"Train", "Meditate"};

        switch (this.getCharacter().readCharacterOptions(options)) {
            case 1:
                this.getCharacter().train();
                if (this.getCharacter().getExp() >= XP_TO_EXPERT) {
                    System.out.println("You have reached the required XP to reach Expert Level.");
                    this.getCharacter().setLevel(new ExpertLevelState(this.getCharacter()));
                }
                break;
            case 2:
                this.getCharacter().meditate();
                break;
        }
    }
}
