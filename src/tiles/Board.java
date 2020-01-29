package tiles;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Board extends Pane {
    int boardColumn;
    int boardRow;

    Board() {
        this.setPrefWidth(600);
        this.setPrefHeight(600);
    }

    public Board setUp(){

        for(int i =0; i<45;i++) {
            Rectangle aTile = new Tiles().getTile();
//            aTile.setTranslateX(70*i);
//            aTile.setTranslateY(60*i);
            aTile.relocate(70*i,0);
            getChildren().add(aTile);
        }

        return this;
    }
}
