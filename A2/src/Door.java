/**
 * This class will allow for a door to be created.
 * @author Ruth Maycock
 * @version 1.0
 */
public class Door extends Wall {

	/**
	 * Creates a new door with its x and y coordinates.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
	 */
    public Door(int xCoord, int yCoord) {
        super(xCoord, yCoord); //Inherits coordinates from Cell.
    }
}
