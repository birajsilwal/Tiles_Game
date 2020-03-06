package tiles;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;
import static tiles.Constants.*;

public class Board{

    private FlowPane root = new FlowPane();

    DisplayTiles displayTiles = new DisplayTiles();

    private List<DisplayTiles> oneTile = new ArrayList<>();

    public void createPane(){
        root.setPrefSize(windowWidth, windowHeight);
        root.setPadding(new Insets(20, 20, 0, 20));

        /* all the tiles are stored in a ArrayList
         listOfTiles are accessed from Constant interface */

        List<DisplayTiles> listOfTiles = new ArrayList<>();
        for (int i = 0; i < totalTiles; i++) {
            listOfTiles.add(new DisplayTiles(oneTile));
        }

        for (int i = 0; i < totalTiles; i++) {
            DisplayTiles displayTiles = listOfTiles.get(i);
            displayTiles.setTranslateX(i % ROW);
            displayTiles.setTranslateY(i / ROW);
            root.getChildren().add(displayTiles);
        }
    }

    public Parent getRoot(){
        return root;
    }



    /* button created horizontally and passes into borderPane in MainController */
    public HBox button() {
        Button start = new Button();
        start.setText("Restart");
        start.setFont(setFontt());

        Button exit = new Button();
        exit.setText("Exit");
        exit.setFont(setFontt());
        exit.setOnMouseClicked(event -> {
        });

        HBox hBox = new HBox(hBoxButtonSpacing, start, exit);
        hBox.setPadding(new Insets(15, 0, 0, 20));

        return hBox;
    }

    /* method to change font style and size*/
    public Font setFontt() {
        return Font.font("Sans", FontWeight.MEDIUM, fontSize);
    }

}