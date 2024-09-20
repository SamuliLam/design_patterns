package state;

public class MasterLevelState extends State {
    public MasterLevelState(Character character) {
        super(character);
    }

    public void action() {
        System.out.println("Your character is at Master Level.");
        System.out.println("You are now the highest level. Game ended.");
        System.out.println("Game restarted. Your character is at Novice Level.");
        this.getCharacter().setLevel(new NoviceLevelState(this.getCharacter()));
    }
}
