package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DisplayTiles extends StackPane {

    Rectangle rectangle = new Rectangle(100, 100);

    Rectangle bigRectangle = new Rectangle(100, 100);
    Rectangle mediumRectangle = new Rectangle(65, 65);
    Rectangle largeRectangle = new Rectangle(30, 30);

    public DisplayTiles() {
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        bigRectangle.setFill(TilesGenerator.getColorBigRectangle());
        mediumRectangle.setFill(TilesGenerator.getColorMediumRectangle());
        largeRectangle.setFill(TilesGenerator.getColorSmallRectangle());

        getChildren().addAll(bigRectangle, mediumRectangle, largeRectangle);
        getChildren().add(rectangle);

        this.setOnMouseClicked(e -> {
            System.out.println("I was clicked.");
        });


    }

    public void isMatched() {


    }

}
