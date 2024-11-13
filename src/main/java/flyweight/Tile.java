package flyweight;

public class Tile {
    private final TileType type;  // Intrinsic state (shared)
    private final int x, y; // Extrinsic state (unique to each tile)
    private final int tileSize;

    public Tile(TileType type, int x, int y, int tileSize) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.tileSize = tileSize;
    }

    public TileType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTileSize() {
        return tileSize;
    }
}
