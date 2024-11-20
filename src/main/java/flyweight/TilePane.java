package flyweight;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TilePane extends Pane {
    public TilePane(Tile tile) {
        Rectangle rect = new Rectangle(tile.getTileSize(), tile.getTileSize());
        switch (tile.getType().getType()) {
            case "road":
                rect.setFill(Color.GRAY);
                break;
            case "building":
                rect.setFill(Color.BEIGE);
                break;
            case "forest":
                rect.setFill(Color.GREEN);
                break;
            case "swamp":
                rect.setFill(Color.DARKGREEN);
                break;
            case "water":
                rect.setFill(Color.BLUE);
                break;
        }
        getChildren().add(rect);
    }
}
