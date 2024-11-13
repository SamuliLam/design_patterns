package flyweight;

import java.util.Random;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        String type;
        if (n == 0) {
            type = "swamp";
        } else if (n == 1) {
            type = "water";
        } else {
            type = "forest";
        }
        return TileFactory.getTile(type, TILE_SIZE);
    }
}
