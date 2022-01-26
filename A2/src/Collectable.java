/**
 * This class creates a collectable item that can be picked up by a player.
 * @author Ruth Maycock
 * @version 1.1
 */
public class Collectable extends Ground {

    private String type; //Defines the type of collectable

    /**
     * Create a collectible with x and y coordinates along with a type.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
     * @param type The type of collectible
     */
    public Collectable(int xCoord, int yCoord, String type) {
        super(xCoord, yCoord); //Inherits coordinates from ground.
        this.type = type;
    }

    /**
     * Get the type of collectable
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type of collectable
     * @param The new type
     */
    public void setType(String type) {
        this.type = type;
    }
}
