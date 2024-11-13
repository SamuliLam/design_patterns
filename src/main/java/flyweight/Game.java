package flyweight;

import java.util.Random;

public class Game {
    public Map createMap(){
        Random rand = new Random();
        int mapWidth = 20;
        int mapHeight = 10;

        if(rand.nextBoolean()){
            return new CityMap(mapWidth, mapHeight);
        } else {
            return new WildernessMap(mapWidth, mapHeight);
        }

    }
}
