package tiles;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainController extends Application {

    public static void main(String[] args) { launch(args); }
    @Override
    public void start(Stage stage) {

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 3,3);
        flowPane.setPadding(new Insets(5));

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setHgap(8);
        gridPane.setVgap(8);

        gridPane.setGridLinesVisible(true);
//        gridPane.getChildren().addAll(flowPane);

        Rectangle rectangle = new Rectangle(100, 100);
        Rectangle rectangle1 = new Rectangle(70, 70);
        rectangle1.setFill(Color.GREEN);
        Circle circle = new Circle(300, 135, 10);
        circle.setFill(Color.DARKSLATEBLUE);
        circle.setStroke(Color.BLACK);


        Rectangle tiles = new Tiles().getTile();


        for (int i = 1; i < 25; i++) {
//            gridPane.getChildren().add(stackPane);
            flowPane.getChildren().addAll(new Tiles().getTile(), new Tiles().getTile1());

        }
            StackPane stackPane = new StackPane();
            stackPane.getChildren().addAll(rectangle, rectangle1, circle);

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
