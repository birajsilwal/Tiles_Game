package tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tiles extends StackPane{
    Rectangle rec = new Rectangle(100,100);


    public Tiles(){

    }

    public Rectangle getTile(){
        rec.setFill(Color.RED);
        setProperty();
        return rec;
    }

    void setProperty(){

    }
}
