package tiles;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.List;
import static tiles.Constants.*;

public class DisplayTiles extends StackPane {

    private static int currentCombo;

    private List<DisplayTiles> displayTiles;
    DisplayTiles thisTile = this;

    Rectangle rectangle = new Rectangle(100, 100);
    Rectangle largeRectangle = new Rectangle(100, 100);
    Rectangle mediumRectangle = new Rectangle(65, 65);
    Rectangle smallRectangle = new Rectangle(30, 30);

    public int  getCurrentCombo() {
        return currentCombo;
    }

    public DisplayTiles() {

    }

    /* this method creates rectangle objects
       there are three rectangle objects i.e. large, medium, and small */

    public DisplayTiles(List<DisplayTiles> list) {
        this.displayTiles = list;
        rectangle.setFill(null);
        rectangle.setStroke(Color.WHITE);
        rectangle.setStrokeWidth(2);

        largeRectangle.setFill(TilesGenerator.getColorBigRectangle());
        mediumRectangle.setFill(TilesGenerator.getColorMediumRectangle());
        smallRectangle.setFill(TilesGenerator.getColorSmallRectangle());

        mediumRectangle.setRotate(angleForMediumRectangle);
        smallRectangle.setRotate(angleForSmallRectangle);

        getChildren().addAll(largeRectangle, mediumRectangle, smallRectangle);
        getChildren().add(rectangle);

        /* when mouse is entered into the tiles it changes stroke color of big tile.
           when mouse is exited tile, it changes stroke color of big tile back into original color */
        this.setOnMouseEntered(event -> rectangle.setStroke(Color.BLACK));
        this.setOnMouseExited(event -> rectangle.setStroke(Color.WHITE));

        /* this event removes the matched tile, if any */
        this.setOnMouseClicked(event -> {

            displayTiles.add(thisTile);
//            System.out.println(displayTiles.size());

            if (displayTiles.size() == 2) {

                DisplayTiles t1 = displayTiles.remove(0);
                DisplayTiles t2 = displayTiles.remove(0);

                if (t1.largeRectangle.getFill().equals(t2.largeRectangle.getFill())) {
                    t1.largeRectangle.setVisible(false);
                    t2.largeRectangle.setVisible(false);
                    currentCombo++;
                    label();


//                    currentCombo++;
//                    System.out.println(currentCombo);
                }

                if (t1.mediumRectangle.getFill().equals(t2.mediumRectangle.getFill())) {
                        t1.mediumRectangle.setVisible(false);
                        t2.mediumRectangle.setVisible(false);
//                        getCurrentCombo();
                }

                if (t1.smallRectangle.getFill().equals(t2.smallRectangle.getFill())) {
                        t1.smallRectangle.setVisible(false);
                        t2.smallRectangle.setVisible(false);
//                        getCurrentCombo();
                }
            }
        });
    }

    /* Created label horizontally for combos and passed to borderPane in MainController */
    public HBox label() {
//        System.out.println(getCurrentCombo());
        Text currentCombo = new Text("Current Combo: " + getCurrentCombo());
        currentCombo.setText("Current Combo "+ getCurrentCombo());
        System.out.println(currentCombo);

        currentCombo.setFont(new Board().setFontt());

        Label longestCombo = new Label("Longest Combo: 0");
        longestCombo.setAlignment(Pos.BASELINE_CENTER);
        longestCombo.setFont(new Board().setFontt());
        longestCombo.setPadding(new Insets(0,0,15, 0));

        HBox hBox = new HBox(hBoxLabelSpacing, currentCombo, longestCombo);

        return (hBox) ;
    }

}


