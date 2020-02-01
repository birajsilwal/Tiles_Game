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

            int xCord = (int) event.getX();
            int yCord = (int) event.getY();
            System.out.println("X: " + xCord + ", Y: " + yCord);
            displayTiles.add(me);
            System.out.println(displayTiles.size());

            if (displayTiles.size() == 2) {

                DisplayTiles t1 = displayTiles.remove(0);
                DisplayTiles t2 = displayTiles.remove(0);

                System.out.println(t1);
                System.out.println(t2);

                if (t1.largeRectangle.getFill().equals(t2.largeRectangle.getFill())) {
                        t1.largeRectangle.setVisible(false);
                        t2.largeRectangle.setVisible(false);
                }

                if (t1.mediumRectangle.getFill().equals(t2.mediumRectangle.getFill())) {
                        t1.mediumRectangle.setVisible(false);
                        t2.mediumRectangle.setVisible(false);
                }

                if (t1.smallRectangle.getFill().equals(t2.smallRectangle.getFill())) {
                        t1.smallRectangle.setVisible(false);
                        t2.smallRectangle.setVisible(false);
                }

            }
        });
    }
}
