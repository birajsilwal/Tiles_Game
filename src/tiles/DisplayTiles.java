package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class DisplayTiles extends StackPane {

    List<Rectangle> currentTile = new ArrayList<>();
    List<Rectangle> nextTile = new ArrayList<>();


    Rectangle rectangle = new Rectangle(100, 100);

    Rectangle largeRectangle = new Rectangle(100, 100);
    Rectangle mediumRectangle = new Rectangle(65, 65);
    Rectangle smallRectangle = new Rectangle(30, 30);

    public DisplayTiles() {
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        largeRectangle.setFill(TilesGenerator.getColorBigRectangle());
        mediumRectangle.setFill(TilesGenerator.getColorMediumRectangle());
        smallRectangle.setFill(TilesGenerator.getColorSmallRectangle());

        getChildren().addAll(largeRectangle, mediumRectangle, smallRectangle);
        getChildren().add(rectangle);



        this.setOnMouseClicked(event -> {
            int xCord = (int) event.getX();
            int yCord = (int) event.getY();
            System.out.println("X: " + xCord + ", Y: " + yCord);
            nextTile.add(rectangle);



        });
    }

    public void isMatched() {

    }

}
