package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tiles extends StackPane {

    Rectangle rectangle = new Rectangle(100, 100);

    Rectangle rectangle1 = new Rectangle(100, 100);
    Rectangle rectangle2 = new Rectangle(80, 80);
    Rectangle rectangle3 = new Rectangle(10, 80);

    public Tiles() {
        rectangle1.setFill(Color.RED);
        rectangle2.setFill(Color.GREEN);
        rectangle3.setFill(Color.BLACK);

        getChildren().addAll(rectangle1, rectangle2, rectangle3);
        getChildren().add(rectangle);

    }
}
