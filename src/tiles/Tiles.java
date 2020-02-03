package tiles;


/* This class is created to track down all the tiles in the game */
public class Tiles  {

    public int[] currentTile;
    public int[] lastTile;
    public boolean containsTile;

    public Tiles() {
        currentTile = new int[3];
        lastTile = new int[3];
        containsTile = true;
    }
}
