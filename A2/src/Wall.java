/**
 * This class creates a wall cell.
 * @author Ruth Maycock
 * @version 1.0
 */
public class Wall extends Cell {

	/**
	 * Creates a wall cell with its x and y coordinates.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
	 */
    public Wall(int xCoord, int yCoord){
    	super(xCoord, yCoord); //Inherits coordinates from cell
    }
}
