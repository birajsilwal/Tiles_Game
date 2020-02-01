package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DisplayTiles extends StackPane {

    public DisplayTiles currentTile = null;

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


        this.setOnMouseEntered(event -> rectangle.setStroke(Color.WHITE));
        this.setOnMouseExited(event -> rectangle.setStroke(Color.BLACK));

        this.setOnMouseClicked(event -> {
            int xCord = (int) event.getX();
            int yCord = (int) event.getY();
            System.out.println("X: " + xCord + ", Y: " + yCord);

            if (currentTile == null) {
                currentTile = this;
            }

            getCurrentTile();
        });
    }

    public void getCurrentTile() {
        this.setOnMouseClicked(event -> {

        });
    }

    public void getNextTile() {

    }

    public boolean isMatched(DisplayTiles matched) {
        return true;
    }

}
