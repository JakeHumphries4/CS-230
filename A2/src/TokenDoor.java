/**
 * This class will create a token door, in which a certain amount
 * of tokens are required to open the door.
 * @author Ruth Maycock
 * @version 1.1
 */
public class TokenDoor extends Door {

	private int tokensRequired; //The amount of tokens a door needs to be opened

	/**
	 * Creates a token door with its x and y coordinates along with the amount
	 * of tokens required to open the door.
     * @param xCoord The x coordinate.
     * @param yCoord The y coordinate.
	 * @param tokensRequired The amount of tokens needed to open the door.
	 */
    public TokenDoor(int xCoord, int yCoord, int tokensRequired) {
        super(xCoord,yCoord); //Inherits coordinates from Cell.
        this.tokensRequired = tokensRequired;
    }

    /**
     * Get the number of tokens needed to open a door.
     * @return The required number of tokens.
     */
    public int getTokensRequired() {
        return tokensRequired;
    }

    /**
     * Set the number of tokens needed to open the door.
     * @param tokensRequired The amount needed for the door to be opened.
     */
    public void setTokensRequired(int tokensRequired) {
        this.tokensRequired = tokensRequired;
    }
}
