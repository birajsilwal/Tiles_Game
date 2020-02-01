package tiles;

import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import static tiles.Constants.*;

public class Board{

    private FlowPane root = new FlowPane();
    private DisplayTiles[][] displayTiles;

    public void createPane(){
        root.setPrefSize(windowWidth, windowHeight);
        GridPane gridPane = new GridPane();

        /*for (int i = 0; i < totalTiles; i++){
            listOfTiles.add(new Tiles());
        }*/

        displayTiles = new DisplayTiles[ROW][COLUMN];

        for (int i = 0; i < ROW; i++){
            for (int j = 0; j < ROW; j++){
                displayTiles[i][j] = new DisplayTiles();
//                gridPane.add(DisplayTiles[i][j], i, j);
                root.getChildren().add(displayTiles[i][j]);
            }
        }
    }

    public Parent getRoot(){
        return root;
    }


}