package flyweight;

import javafx.scene.layout.GridPane;

public abstract class Map {
    private Tile[][] tiles;
    private static final int TILE_SIZE = 20;

    public abstract Tile createTile(int x, int y, int tileSize);

    protected Map(int width, int height) {
        tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile(j, i, TILE_SIZE);
            }
        }
    }

    public GridPane draw() {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                Tile tile = tiles[i][j];
                gridPane.add(new TilePane(tile), tile.getX(), tile.getY());
            }
        }
        return gridPane;
    }
}
