package tiles;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class MainController extends Application {

    public static void main(String[] args) { launch(args); }
    @Override

    /* hBox pane is inserted inside BorderPane. BorderPane is inserted inside AnchorPane */
    public void start(Stage stage) {
        stage.setTitle("Tiles Game");
        Board board = new Board();
        BorderPane borderPane = new BorderPane();
        AnchorPane anchorPane = new AnchorPane();

        board.createPane();
        Parent root = board.getRoot();

        borderPane.setCenter(root);
        borderPane.setBottom(new Board().label());
        borderPane.setTop(new Board().button());
        anchorPane.getChildren().add(borderPane);

        stage.setScene(new Scene(anchorPane));
        stage.show();

//        if (new Board().isClicked()) {
//            stage.close();
//        }
    }
}
