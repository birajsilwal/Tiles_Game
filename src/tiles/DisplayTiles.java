package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DisplayTiles extends StackPane {

    private DisplayTiles currentTile = null;

    Rectangle rectangle = new Rectangle(100, 100);
    Rectangle largeRectangle = new Rectangle(100, 100);
    Rectangle mediumRectangle = new Rectangle(65, 65);
    Rectangle smallRectangle = new Rectangle(30, 30);

    /* this method creates rectangle objects
       there are three rectangle objects i.e. large, medium, and small */

    public DisplayTiles() {
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        largeRectangle.setFill(TilesGenerator.getColorBigRectangle());
        mediumRectangle.setFill(TilesGenerator.getColorMediumRectangle());
        smallRectangle.setFill(TilesGenerator.getColorSmallRectangle());

        getChildren().addAll(largeRectangle, mediumRectangle, smallRectangle);
        getChildren().add(rectangle);


        /* when mouse is entered into the tiles it changes stroke color of big tile.
           when mouse is exited tile, it changes stroke color of big tile back into black */
        this.setOnMouseEntered(event -> rectangle.setStroke(Color.WHITE));
        this.setOnMouseExited(event -> rectangle.setStroke(Color.BLACK));

        /* this event removes the matched tile, if any */
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

    /* This method is created to get the current selected tile */
    private void getCurrentTile() {
        this.setOnMouseClicked(event -> {

        });
    }

    /* This method stores the last clicked tile */
    private void getLastTile() {

    }

    /* This boolean method checks if current selected tile is equal to the last tile */
    private boolean isMatched(DisplayTiles matched) {
        return true;
    }
}
