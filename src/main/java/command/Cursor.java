package command;

import javafx.scene.paint.Color;

public class Cursor {
    private int x;
    private int y;
    private Pixel[][] grid;

    public Cursor(Pixel[][] grid) {
        this.grid = grid;
        this.x = 0;
        this.y = 0;
    }

    public void moveCursorDown() {
        if (y < grid.length - 1) {
            y++;
            highlightCurrentPixel();
        }
    }

    public void moveCursorUp() {
        if (y > 0) {
            y--;
            highlightCurrentPixel();
        }
    }

    public void moveCursorLeft() {
        if (x > 0) {
            x--;
            highlightCurrentPixel();
        }
    }

    public void moveCursorRight() {
        if (x < grid[0].length - 1) {
            x++;
            highlightCurrentPixel();
        }
    }

    public Pixel getCurrentPixel() {
        return grid[y][x];
    }

    public void highlightCurrentPixel() {
        for (Pixel[] row : grid) {
            for (Pixel pixel : row) {
                pixel.setStroke(null);
            }
        }
        grid[y][x].setStroke(Color.RED);
        grid[y][x].setStrokeWidth(2.0);
    }
}
