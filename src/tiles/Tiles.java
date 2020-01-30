package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Tiles extends StackPane {

    Rectangle rectangle = new Rectangle(100, 100);

    Rectangle rectangle1 = new Rectangle(100, 100);
    Rectangle rectangle2 = new Rectangle(65, 65);
    Rectangle rectangle3 = new Rectangle(30, 30);

    public Tiles() {
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        rectangle1.setFill(getColorBigRectangle());

        rectangle2.setFill(getColorMediumRectangle());
        rectangle3.setFill(getColorLargeRectangle());

        getChildren().addAll(rectangle1, rectangle2, rectangle3);
        getChildren().add(rectangle);

    }

    private Color getColorBigRectangle(){
        Random random = new Random();
        int rand = random.nextInt(3);
        System.out.println(rand);
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

    private Color getColorMediumRectangle() {
        Random random = new Random();
        int rand = random.nextInt(3);
        System.out.println(rand);
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

    private Color getColorLargeRectangle() {
        Random random = new Random();
        int rand = random.nextInt(2);
        System.out.println(rand);
        switch (rand) {
            case 0:
                return Color.BLACK;
            case 1:
                return Color.BROWN;
        }
        return Color.BLACK;
    }

}
