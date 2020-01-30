package tiles;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class Board{

    private int row;
    private int column;
    private int totalTiles = row  * column;

    public Board(int row, int column, Tiles tiles) {
        this.row = row;
        this.column = column;
        this.tiles = tiles;
    }

    private Pane root = new Pane();

    public void createPane(){
        root.setPrefSize(800,800);
    }

    public Parent getRoot(){
        return root;
    }

    Tiles tiles = new Tiles();

}