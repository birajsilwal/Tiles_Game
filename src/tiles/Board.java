package tiles;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

import static tiles.Constants.*;

public class Board{

    private FlowPane root = new FlowPane();
    List<Tiles> listOfTiles = new ArrayList<>();
    private DisplayTiles[][] displayTiles;

    public void createPane(){

        root.setPrefSize(windowWidth, windowHeight);

        /*for (int i = 0; i < totalTiles; i++){
            listOfTiles.add(new Tiles());
        }*/

        displayTiles = new DisplayTiles[ROW][COLUMN];

        for (int i = 0; i < ROW; i++){
            for (int j = 0; j < ROW; j++){
                displayTiles[i][j] = new DisplayTiles();
                root.getChildren().add(displayTiles[i][j]);
            }
        }
    }

    public Parent getRoot(){
        return root;
    }


}