package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.List;
import static tiles.Constants.*;

public class DisplayTiles extends StackPane {

    private DisplayTiles currentTile = null;
    private List<DisplayTiles> displayTiles;
    DisplayTiles me = this;

    Rectangle rectangle = new Rectangle(100, 100);
    Rectangle largeRectangle = new Rectangle(100, 100);
    Rectangle mediumRectangle = new Rectangle(65, 65);
    Rectangle smallRectangle = new Rectangle(30, 30);

    /* this method creates rectangle objects
       there are three rectangle objects i.e. large, medium, and small */

    public DisplayTiles(List<DisplayTiles> list) {
        this.displayTiles = list;
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        largeRectangle.setFill(TilesGenerator.getColorBigRectangle());
        mediumRectangle.setFill(TilesGenerator.getColorMediumRectangle());
        smallRectangle.setFill(TilesGenerator.getColorSmallRectangle());

        mediumRectangle.setRotate(angleForMediumRectangle);
        smallRectangle.setRotate(angleForSmallRectangle);

        getChildren().addAll(largeRectangle, mediumRectangle, smallRectangle);
        getChildren().add(rectangle);

        /* when mouse is entered into the tiles it changes stroke color of big tile.
           when mouse is exited tile, it changes stroke color of big tile back into black */
        this.setOnMouseEntered(event -> rectangle.setStroke(Color.WHITE));
        this.setOnMouseExited(event -> rectangle.setStroke(Color.BLACK));

        /* this event removes the matched tile, if any */
        this.setOnMouseClicked(event -> {
            System.out.println("in");
            int xCord = (int) event.getX();
            int yCord = (int) event.getY();
            System.out.println("X: " + xCord + ", Y: " + yCord);
            displayTiles.add(me);
            System.out.println(displayTiles.size());;
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        });
    }
}
