package RPG;

public class BuildingTile extends Tile{
    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getType() {
        return "building";
    }
}
