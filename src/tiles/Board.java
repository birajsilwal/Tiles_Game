package tiles;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Board{

    private int row = 6;
    private int column = 6;
    private int scale = 2;
    private int totalTiles = row  * column;
    private DisplayTiles[][] displayTiles;

    private FlowPane root = new FlowPane();
    List<Tiles> listOfTiles = new ArrayList<>();

    public void createPane(){

        root.setPrefSize(650,650);

        for (int i = 0; i < totalTiles; i++){
            listOfTiles.add(new Tiles());
        }

        displayTiles = new DisplayTiles[row][column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                displayTiles[i][j] = new DisplayTiles();
                root.getChildren().add(displayTiles[i][j]);
            }
        }



    }

    public Parent getRoot(){
        return root;
    }


}