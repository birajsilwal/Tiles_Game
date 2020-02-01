package tiles;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import java.util.ArrayList;
import java.util.List;
import static tiles.Constants.*;

public class Board{

    private FlowPane root = new FlowPane();

    public void createPane(){
        // size are
        root.setPrefSize(windowWidth, windowHeight);
        root.setPadding(new Insets(20, 20, 0, 20));

        // all the tiles are stored in a ArrayList
        // listOfTiles are accessed from Constant interface

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
}