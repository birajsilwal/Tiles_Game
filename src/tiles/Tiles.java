package tiles;
import java.util.ArrayList;
import java.util.List;


public class Tiles  {

    public int[] firstTile;
    public int[] secondTile;

    public Tiles() {
        firstTile = new int[3];
        secondTile = new int[3];
    }


    DisplayTiles displayTiles =  new DisplayTiles();


    List<Tiles> listOfTiles = new ArrayList<>();

    public void isMatched() {


    }

    public void removeTile() {

        if (getCurrentTile() == getLastTile()) {
            displayTiles.rectangle.setFill(null);
        }

    }

//    public void overTile(int x, int y) {
//        int distX = Math.abs(x - (this.getWidth()/2));
//    }

    public DisplayTiles getCurrentTile() {

        DisplayTiles displayTiles = new DisplayTiles();
        return displayTiles;
    }

    public DisplayTiles getLastTile() {
        DisplayTiles displayTiles = new DisplayTiles();
        return displayTiles;
    }

}
