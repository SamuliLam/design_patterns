package state;

public class IntermediateLevelState extends State  {

    public IntermediateLevelState(Character character) {
        super(character);
    }

    public void action() {

        System.out.println("Name: " + this.getCharacter().getName());
        System.out.println("XP: " + this.getCharacter().getExp());
        System.out.println("Health: " + this.getCharacter().getHealthPoints());

        final int XP_TO_EXPERT = 150;
        String [] options = {"Train", "Meditate"};

        switch (this.getCharacter().readCharacterOptions(options)) {
            case 1:
                this.getCharacter().train();
                if (this.getCharacter().getExp() >= XP_TO_EXPERT) {
                    System.out.println("You have reached the required XP to reach Expert Level.");
                    this.getCharacter().setLevel(new ExpertLevelState(this.getCharacter()));
                    System.out.println("Your character is at Expert Level.");
                    System.out.println("You gained the ability to fight. Fighting will greatly increase your XP but you will lose HP.");
                }
                break;
            case 2:
                this.getCharacter().meditate();
                break;
        }
    }
}
