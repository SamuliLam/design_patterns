package RPG;

public abstract class Map {
    private Tile[][] tiles;
    public abstract Tile createTile();

    protected Map(int width, int height){
        tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }
    public void display(){
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                System.out.print(tiles[i][j].getCharacter());
            }
            System.out.println();
        }
    }
}
