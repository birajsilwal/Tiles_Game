package tiles;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Board{

    private int row;
    private int column;
    private int scale = 100;
    private int totalTiles = row  * column;

    List<Tiles> listOfTiles = new ArrayList<>();



    private Pane root = new Pane();

    public void createPane(){

        for (int i = 0; i < totalTiles; i++){
            listOfTiles.add(new Tiles());
        }

        root.setPrefSize(600,600);

        for (int i = 0; i < totalTiles; i++) {
            Tiles tiles = listOfTiles.get(i);
            tiles.setTranslateX(scale * row);
            tiles.setTranslateY(scale * column);

        }
        root.getChildren().add(tiles);
    }

    public Parent getRoot(){
        return root;
    }


    Tiles tiles = new Tiles();

}