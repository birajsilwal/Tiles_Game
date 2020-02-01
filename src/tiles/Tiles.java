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

    /* it removes specific tile from the tiles */
    public void removeTile() {

    }

    /* This method checks if there are tiles or not */
    public boolean containsTile() {
        return true;
    }

    /* set the current selected tile */
    public void setCurrentTile(int a, int b) {
        currentTile[0] = a;
        currentTile[1] = b;
        containsTile = true;
    }

    public void setLastTile(int a, int b) {
        lastTile[0] = a;
        lastTile[1] = b;
        containsTile = true;
    }

    /* get current tiles */
    public int[] getCurrentTile() {
        return currentTile;
    }

    public int[] getLastTile() {
        return lastTile;
    }

}
