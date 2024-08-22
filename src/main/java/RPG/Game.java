package RPG;

import java.util.Random;
import java.util.Scanner;

public  class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        do {
            System.out.println("Press enter to move to generate a new map ('q' to quit).");
            Map map = game.createMap();
            map.display();
        } while (!sc.nextLine().equals("q"));
    }
    public  Map createMap(){
        Random rand = new Random();
        int mapWidth = 10;
        int mapHeight = 3;

        if(rand.nextBoolean()){
            return new CityMap(mapWidth, mapHeight);
        } else {
            return new WildernessMap(mapWidth, mapHeight);
        }

    }
}
