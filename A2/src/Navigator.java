/**
 * This class will allow for all movable objects
 * to move around the game.
 * @author Johannes Zischka, Thomas Williams
 * @version 3.1
 */
public abstract class Navigator {
    private int xPos;
    private int yPos;
    private Cell cell;

    /**
     * This allows for the navigator class to take in
     * coordinates for a child class to move
     * @param xPos The x coordinate
     * @param yPos The y coordinate
     */
    public Navigator(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * This method will check if a proposed move is valid,
     * by checking if the cell it is moving to is ground.
     * @param moveCell Takes in the current cell
     * @return if the move is valid or not
     */
    private boolean isValidMove(Cell moveCell) {
        if (moveCell.getType.equals("Ground")) {
            return true;
        } else {
		return false;
        }
    }

    /**
     * Method for a navigator travelling north
     * @return If the cell is ground then true otherwise false
     */
    protected boolean moveNorth() {
        if (isValidMove(cell.getNorth())) {
            cell = cell.getNorth();
            return true;
        } else {
        	return false;
        }
    }

    /**
     * Method for a navigator travelling east
     * @return If the cell is ground then true otherwise false
     */
    protected boolean moveEast() {
        if (isValidMove(cell.getEast())) {
            cell = cell.getEast();
            return true;
        } else {
        	return false;
        }
    }

    /**
     * Method for a navigator travelling south
     * @return If the cell is ground then true otherwise false
     */
    protected boolean moveSouth() {
        if (isValidMove(cell.getSouth())) {
            cell = cell.getSouth();
            return true;
        } else {
        	return false;
        }
    }

    /**
     * Method for a navigator travelling west
     * @return If the cell is ground then true otherwise false
     */
    protected boolean moveWest() {
        if (isValidMove(cell.getWest())) {
            cell = cell.getWest();
            return true;
        } else {
        	return false;
        }
    }

    /**
     * Method for retrieving the x coordinate
     * @return x coordinate
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * Method for retrieving the y coordinate
     * @return y coordinate
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * Method for returning the current cell
     * @return the cell
     */
    private Cell getCell() {
    	return cell;
    }
}
