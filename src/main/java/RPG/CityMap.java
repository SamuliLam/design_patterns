package RPG;

import java.util.Random;

public class CityMap extends Map{
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile(){
        Random rand = new Random();
        int n = rand.nextInt(3);
        if(n == 0){
            return new RoadTile();
        } else if(n == 1){
            return new BuildingTile();
        } else {
            return new ForestTile();
        }
    }
}
