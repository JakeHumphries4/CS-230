/**
 * This class is for creating a line enemy.
 * @author Thomas Williams
 * @version 2.3
 */
public class LineEnemy extends Navigator {

	private String direction; //The direction the enemy is currently travelling

	/**
	 * Creates an instance of the LineEnemy class
	 * @param xCoord takes in the x coordinate from Navigator
	 * @param yCoord takes in the y coordinate from Navigator
	 * @param direction takes in the enemies direction
	 */
	public LineEnemy(int xCoord, int yCoord, String direction) {
		super(xCoord, yCoord); //Inherits coordinates from Navigator
		this.direction = direction;
	}

	/**
	 * This method will set the direction of the enemy
	 * @param direction The enemies direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * This method will return the direction of the enemy
	 * @return the current direction of the enemy
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * This method will use the current direction and
	 * call to the Navigator class, which allows for the
	 * enemy to be moved
	 */
	public void nextMove() {
		/*
		 * The method will check the cell in front, if
		 * it is ground then it moves forward, otherwise it
		 * turns around and moves in that direction.
		 */
		if (getDirection() == "North") {
			if(super.moveNorth()) {
			} else {
				setDirection("South");
				super.moveSouth();
			}
		} else if (getDirection() == "South") {
			if(super.moveSouth()) {
			} else {
				setDirection("North");
				super.moveNorth();
			}
		} else if (getDirection() == "East") {
			if(super.moveEast()) {
			} else {
				setDirection("West");
				super.moveWest();
			}
		} else if (getDirection() == "West") {
			if(super.moveWest()) {
			} else {
				setDirection("East");
				super.moveEast();
			}
		} else {
			System.out.println("We got a problem");
		}
	}
}
