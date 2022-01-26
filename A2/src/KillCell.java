/**
 * This class will create a type of cell that can kill a player,
 * if the player moves on them without having a certain collectable.
 * @author Ruth Maycock
 * @version 1.1
 */
public class KillCell extends Cell {

    private String type; //The type of kill cell

    /**
	 * Creates a kill cell with its x and y coordinates, along with
	 * the type of kill cell.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
     * @param type The type of kill cell.
     */
    public KillCell (int xCoord, int yCoord, String type) {
        super(xCoord, yCoord); //Inherits coordinates from Cell.
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
