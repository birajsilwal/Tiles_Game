package tiles;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainController extends Application {

    public static void main(String[] args) { launch(args); }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Tiles");
        stage.setScene(new Scene(GUI()));
        stage.show();
        Canvas canvas = new Canvas(500, 500);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
    }

    private Parent GUI() {
        Pane root = new Pane();
        root.setPrefSize(800,800);
        root.getChildren().add(new Board().setUp());
//        for(int i =0; i<5;i++) {
//            root.getChildren().add(new Tiles().getTile());
//        }
        return root;
    }
}
