package flyweight;

import javafx.scene.layout.GridPane;

public abstract class Map {
    private Tile[][] tiles;
    protected static final int TILE_SIZE = 20;

    protected Map(int width, int height) {
        tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public abstract Tile createTile();

    public GridPane draw() {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                gridPane.add(new TilePane(tiles[i][j]), j, i);
            }
        }
        return gridPane;
    }
}
