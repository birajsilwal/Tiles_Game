package tiles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Board extends Application {
    Stage window;
    int boardColumn;
    int boardRow;

//    Board() {
//        this.setPrefWidth(600);
//        this.setPrefHeight(600);
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        window = primaryStage;
//        window.setTitle("Tiles");
//
//        GridPane gridPane = new GridPane();
//        gridPane.setPadding(new Insets(10,10,10,10));
//        gridPane.setHgap(8);
//        gridPane.setVgap(8);
//
//        Rectangle aTile = new Tiles().getTile();
//        GridPane.setConstraints(aTile, 0, 0);
//        gridPane.setGridLinesVisible(true);
//        gridPane.getChildren().addAll(aTile);
//        Scene scene = new Scene(gridPane, 600, 600);
//        window.setScene(scene);
//        window.show();
    }

    public Board setUp(){

//        for(int i =0; i<45;i++) {
//            Rectangle aTile = new Tiles().getTile();
////            aTile.setTranslateX(70*i);
////            aTile.setTranslateY(60*i);
//            aTile.relocate(70*i,0);
//            getChildren().add(aTile);
//        }

        return this;
    }
}
