package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tiles extends StackPane {

    Rectangle rectangle = new Rectangle(100, 100);

    Rectangle bigRectangle = new Rectangle(100, 100);
    Rectangle mediumRectangle = new Rectangle(65, 65);
    Rectangle largeRectangle = new Rectangle(30, 30);

    public Tiles() {
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        bigRectangle.setFill(TilesGenerator.getColorBigRectangle());
        mediumRectangle.setFill(TilesGenerator.getColorMediumRectangle());
        largeRectangle.setFill(TilesGenerator.getColorSmallRectangle());

        getChildren().addAll(bigRectangle, mediumRectangle, largeRectangle);
        getChildren().add(rectangle);
    }
}
