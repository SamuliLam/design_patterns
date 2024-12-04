package command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class GUI extends Application {
    private Pixel[][] grid;

    private Cursor cursor;

    @Override
    public void start(Stage primaryStage) {
        final int numCols = 8;
        final int numRows = 8;
        grid = new Pixel[numRows][numCols];

        GridPane gridPane = new GridPane();

        for (int i = 0; i < numCols; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            RowConstraints rowConst = new RowConstraints();
            colConst.setPercentWidth(100.0 / numCols);
            rowConst.setPercentHeight(100.0 / numRows);
            gridPane.getColumnConstraints().add(colConst);
            gridPane.getRowConstraints().add(rowConst);
        }

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Pixel pixel = new Pixel();
                grid[row][col] = pixel;
                gridPane.add(pixel, col, row);
            }
        }

        cursor = new Cursor(grid);
        cursor.highlightCurrentPixel();

        Scene scene = new Scene(createMainLayout(gridPane));
        scene.setOnKeyPressed(this::listenToKeyPressed);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.show();
    }

    private BorderPane createMainLayout(GridPane gridPane) {
        BorderPane mainLayout = new BorderPane();
        mainLayout.setCenter(gridPane);

        Button createCodeButton = new Button("Create Code");
        createCodeButton.setFocusTraversable(false); // Prevent button from taking focus
        createCodeButton.setOnAction(event -> executeCommand(new GenerateCodeCommand(grid)));

        HBox buttonBar = new HBox(createCodeButton);
        buttonBar.setSpacing(10);
        mainLayout.setBottom(buttonBar);

        return mainLayout;
    }


    private void listenToKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case SPACE:
                executeCommand(new TogglePixelCommand(cursor.getCurrentPixel()));
                break;
            case UP:
                executeCommand(new MoveCursorUpCommand(cursor));
                break;
            case DOWN:
                executeCommand(new MoveCursorDownCommand(cursor));
                break;
            case LEFT:
                executeCommand(new MoveCursorLeftCommand(cursor));
                break;
            case RIGHT:
                executeCommand(new MoveCursorRightCommand(cursor));
                break;
            default:
                System.out.println("No command associated with this key: " + event.getCode());
        }
    }

    private void executeCommand(Command command) {
        command.execute();
    }
}
