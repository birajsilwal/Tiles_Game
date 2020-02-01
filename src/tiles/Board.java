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

import java.util.ArrayList;
import java.util.List;
import static tiles.Constants.*;

public class Board{

    private FlowPane root = new FlowPane();

    public void createPane(){

        root.setPrefSize(windowWidth, windowHeight);
        root.setPadding(new Insets(20, 20, 0, 20));

        /* all the tiles are stored in a ArrayList
         listOfTiles are accessed from Constant interface */

        List<DisplayTiles> listOfTiles = new ArrayList<>();
        for (int i = 0; i < totalTiles; i++) {
            listOfTiles.add(new DisplayTiles());
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

    /* Created label horizontally for combos and passed to borderPane in MainController */
    public HBox label() {
        Label currentCombo = new Label("Current Combo: 0");
        currentCombo.setFont(setFontt());
        currentCombo.setPadding(new Insets(0,0,15, 20));

        Label longestCombo = new Label("Longest Combo: 0");
        longestCombo.setAlignment(Pos.BASELINE_CENTER);
        longestCombo.setFont(setFontt());
        longestCombo.setPadding(new Insets(0,0,15, 0));

        HBox hBox = new HBox(hBoxLabelSpacing, currentCombo, longestCombo);

        return (hBox) ;
    }

    /* button created horizontally and passes into borderPane in MainController */
    public HBox button() {
        Button start = new Button();
        start.setText("Restart");
        start.setFont(setFontt());

        Button exit = new Button();
        exit.setText("Exit");
        exit.setFont(setFontt());

        HBox hBox = new HBox(hBoxButtonSpacing, start, exit);
        hBox.setPadding(new Insets(15, 0, 0, 15));

        return hBox;
    }

    /* method to change font style and size*/
    public Font setFontt() {
        return Font.font("Sans", FontWeight.MEDIUM, fontSize);
    }


}