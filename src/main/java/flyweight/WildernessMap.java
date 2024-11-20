package flyweight;

import java.util.Random;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile(int x, int y, int tileSize) {
        Random rand = new Random();
        TileType type;
        int n = rand.nextInt(3);

        if (n == 0) {
            type = TileFactory.getTileType("swamp");
        } else if (n == 1) {
            type = TileFactory.getTileType("water");
        } else {
            type = TileFactory.getTileType("forest");
        }

        return new Tile(type, x, y, tileSize);
    }
}
