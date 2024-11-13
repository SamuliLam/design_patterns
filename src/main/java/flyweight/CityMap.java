package flyweight;

import java.util.Random;

public class CityMap extends Map {

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        String type;
        if (n == 0) {
            type = "road";
        } else if (n == 1) {
            type = "building";
        } else {
            type = "water";
        }
        return TileFactory.getTile(type, TILE_SIZE);
    }
}
