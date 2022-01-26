/**
 * The class creates the goal the player must reach.
 * @author Ruth Maycock
 * @version 1.0
 */
public class Goal extends Cell {

	/**
	 * Creates a goal cell with its x and y coordinates.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
	 */
    public Goal(int xCoord, int yCoord) {
    	super(xCoord, yCoord); //Inherits coordinates from Cell
    }
}
