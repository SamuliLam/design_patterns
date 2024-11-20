package flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameApp extends Application {
    private Game game = new Game();

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Map map = game.createMap();
        root.getChildren().add(map.draw());

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}