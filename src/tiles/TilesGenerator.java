package tiles;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import java.util.Random;

public class TilesGenerator extends Canvas {

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

    public static Color getColorSmallRectangle() {
        Random random = new Random();
        int rand = random.nextInt(2);
        switch (rand) {
            case 0:
                return Color.BLACK;
            case 1:
                return Color.BROWN;
        }
        return Color.BLACK;
    }
}
