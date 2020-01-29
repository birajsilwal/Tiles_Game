package tiles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainController extends Application {

    public static void main(String[] args) { launch(args); }
    @Override
    public void start(Stage stage) {

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 5,5);
        flowPane.setPadding(new Insets(5));

        for (int i = 1; i <= 25; i++) {
            flowPane.getChildren().add(new Tiles().getTile());
        }

        Scene scene = new Scene(flowPane, 550, 550);

        stage.setTitle("FlowPane");
        stage.setScene(scene);
        stage.show();


//        stage.setTitle("Tiles");
//        GridPane gridPane = new GridPane();
//        gridPane.setPadding(new Insets(10,10,10,10));
//        gridPane.setHgap(8);
//        gridPane.setVgap(8);
//
//        Rectangle aTile = new Tiles().getTile();
////        GridPane.setConstraints(aTile, 0, 0);
//        gridPane.setGridLinesVisible(true);
//        gridPane.getChildren().addAll(flowPane);
//        Scene scene = new Scene(gridPane, 500, 500);
//        stage.setScene(scene);
//        stage.show();

//        stage.setTitle("Tiles");
////        stage.setScene(new Scene(GUI()));
//        Board board = new Board();
//        stage.show();
//        Canvas canvas = new Canvas(500, 500);

//        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
    }

    private Parent GUI() {
        Pane root = new Pane();
        root.setPrefSize(800,800);
//        root.getChildren().add(new Board().setUp());
//        for(int i =0; i<5;i++) {
//            root.getChildren().add(new Tiles().getTile());
//        }
        return root;
    }
}
