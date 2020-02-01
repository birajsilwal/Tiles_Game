package tiles;

import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

import static tiles.Constants.*;

public class Board{

    private FlowPane root = new FlowPane();
    private DisplayTiles[][] displayTiles;

    public void createPane(){
        root.setPrefSize(windowWidth, windowHeight);
        GridPane gridPane = new GridPane();

        List<DisplayTiles> listOfTiles = new ArrayList<>();
        for (int i = 0; i < totalTiles; i++) {
            listOfTiles.add(new DisplayTiles());
        }

        for (int i = 0; i < totalTiles; i++) {
            DisplayTiles displayTiles = listOfTiles.get(i);
            displayTiles.setTranslateX((i % ROW));
            displayTiles.setTranslateY((i / ROW));
            root.getChildren().add(displayTiles);
        }


        displayTiles = new DisplayTiles[ROW][COLUMN];
    }

    public Parent getRoot(){
        return root;
    }


}