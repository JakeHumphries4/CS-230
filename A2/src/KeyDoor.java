/**
 * This class creates a key door.
 * @author Ruth Maycock
 * @version 1.1
 */
public class KeyDoor extends Door {

    private String colour; //The colour of the door

    /**
	 * Creates a key door with its x and y coordinates along with the colour of the door.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
     * @param colour The colour of the door.
     */
    public KeyDoor(int xCoord, int yCoord, String colour) {
        super(xCoord, yCoord);
        this.colour = colour;
    }

    /**
     * Get the colour of the door
     * @return The colour of the chosen door
     */
    public String getColour() {
        return colour;
    }

    /**
     * Set the colour of the door
     * @param colour The colour chosen for this door
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
}
