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
        Board board = new Board();
        board.createPane();
        Parent root = board.getRoot();
        stage.setTitle("FlowPane");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
