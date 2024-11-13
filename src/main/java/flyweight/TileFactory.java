package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {

    private static final Map<String, TileType> tileTypes = new HashMap<>();

    public static TileType getTileType(String type) {
        return tileTypes.computeIfAbsent(type, TileType::new);
    }
}
