package tiles;

import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Board{

    private int row = 6;
    private int column = 6;
    private int scale = 2;
    private int totalTiles = row  * column;
    private Tiles[][] tiles;

    List<Tiles> listOfTiles = new ArrayList<>();

    private FlowPane root = new FlowPane();

    public void createPane(){

        for (int i = 0; i < totalTiles; i++){
            listOfTiles.add(new Tiles());
        }

        root.setPrefSize(650,650);

        tiles = new Tiles[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                tiles[i][j] = new Tiles();
                root.getChildren().add(tiles[i][j]);
            }
        }
    }

    public Parent getRoot(){
        return root;
    }
}