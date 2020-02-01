package tiles;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class TilesGenerator extends Canvas {

    private GraphicsContext graphicsContext;

    public TilesGenerator() {
        this.setWidth(100);
        this.setHeight(100);
        graphicsContext = this.getGraphicsContext2D();
    }

    // this creates three random color for big rectangle
    public static Color getColorBigRectangle(){
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.CORAL;
        }
        return Color.BLACK;
    }

    // this creates three random color for medium rectangle

    public static Color getColorMediumRectangle() {
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return Color.GREEN;
            case 1:
                return Color.DARKSLATEBLUE;
            case 2:
                return Color.ORANGE;
        }
        return Color.BLACK;
    }

    // this creates three random color for small rectangle

    public static Color getColorSmallRectangle() {
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return Color.BLACK;
            case 1:
                return Color.CADETBLUE;
            case 2:
                return Color.DARKVIOLET;
        }
        return Color.BLACK;
    }
}
