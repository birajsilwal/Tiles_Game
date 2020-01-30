package tiles;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tiles extends Canvas {
    private GraphicsContext graphicsContext;
    int width;
    int height;

    public Tiles(int width, int height) {
        this.width = width;
        this.height = height;
    }

    Rectangle rec = new Rectangle(100, 100);
    Rectangle rec1 = new Rectangle(70, 70);

    public Tiles(){

    }

    public Rectangle getTile(){
        rec.setFill(Color.RED);
//        setProperty();
        return rec;
    }

    public Rectangle getTile1(){
        rec1.setFill(Color.GREEN);
        return rec1;
    }

//    void setProperty(){
//
//    }

//    public void drawTiles(){
//
//    }
}
