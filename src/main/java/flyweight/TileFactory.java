package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {

    private static final Map<String, Tile> tiles = new HashMap<>();

    public static Tile getTile(String type, int tileSize) {
        Tile tile = tiles.get(type);
        if (tile == null) {
            tile = new Tile(new TileType(type), tileSize);
            tiles.put(type, tile);
        }
        return tile;
    }
}
