package flyweight;

import java.util.Random;

public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile(int x, int y, int tileSize) {
        Random rand = new Random();
        TileType type;
        int n = rand.nextInt(3);

        if (n == 0) {
            type = TileFactory.getTileType("road");
        } else if (n == 1) {
            type = TileFactory.getTileType("building");
        } else {
            type = TileFactory.getTileType("water");
        }

        return new Tile(type, x, y, tileSize);
    }
}
