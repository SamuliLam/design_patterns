package RPG;

import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n==0){
            return new SwampTile();
        } else if (n==1) {
            return new WaterTile();
        } else {
            return new ForestTile();
        }
    }
}
