package flyweight;

public class Tile {
    private TileType type;
    private int tileSize;

    public Tile(TileType type, int tileSize) {
        this.type = type;
        this.tileSize = tileSize;
    }

    public TileType getType() {
        return type;
    }

    public int getTileSize() {
        return tileSize;
    }
}