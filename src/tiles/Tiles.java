package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tiles extends StackPane {

    Rectangle rectangle = new Rectangle(100, 100);


    Rectangle rectangle1 = new Rectangle(100, 100);
    Rectangle rectangle2 = new Rectangle(70, 70);
    Rectangle rectangle3 = new Rectangle(30, 30);

    public Tiles() {
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);

        rectangle1.setFill(Color.RED);
        rectangle2.setFill(Color.GREEN);
        rectangle3.setFill(Color.BLACK);

        getChildren().addAll(rectangle1, rectangle2, rectangle3);
        getChildren().add(rectangle);

    }
}
