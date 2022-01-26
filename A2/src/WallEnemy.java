/**
 * This class is for creating a wall enemy.
 * @author Thomas Williams
 * @version 3.2
 */

public class WallEnemy extends Navigator {

	private String direction; //The current direction the enemy is travelling

	/**
	 * Constructor for a wall enemy
	 * @param xCoord The x coordinate
	 * @param yCoord The y coordinate
	 * @param direction The enemies current direction
	 */
	public WallEnemy(int xCoord, int yCoord, String direction) {
		super(xCoord, yCoord); //Inherits coordinates from Navigator
		this.direction = direction;
	}

	/**
	 * This methods sets the direction of the enemy
	 * @param direction The new direction an enemy should travel
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * This method gets the enemies current direction
	 * @return The current direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * This method calculates the next move of the wall enemy,
	 * by calling methods from navigator in order to check
	 * for walls, allowing the enemy to move
	 */
	public void nextMove() {
		/*
		 * The method checks the cell to the left of the enemy,
		 * and moves if its a ground cell. If its not ground, then it
		 * will do the same for the cell in front, and if thats ground,
		 * it will check the cell to its right. If that to is ground, then it
		 * will move backwards, as it has reached a dead end.
		 */
		if (getDirection() == "North") {
			if (super.moveWest()) {
				setDirection("West");
			} else if (super.moveNorth()) {
				setDirection("North");
			} else if (super.moveEast()) {
				setDirection("East");
			} else {
				super.moveSouth();
				setDirection("South");
			}
		} else if (getDirection() == "East") {
			if (super.moveNorth()) {
				setDirection("North");
			} else if (super.moveEast()) {
				setDirection("East");
			} else if (super.moveSouth()) {
				setDirection("South");
			} else {
				super.moveWest();
				setDirection("West");
			}
		} else if (getDirection() == "South") {
			if (super.moveEast()) {
				setDirection("East");
			} else if (super.moveSouth()) {
				setDirection("South");
			} else if (super.moveWest()) {
				setDirection("West");
			} else {
				super.moveNorth();
				setDirection("North");
			}
		} else if (getDirection() == "West") {
			if (super.moveSouth()) {
				setDirection("South");
			} else if (super.moveWest()) {
				setDirection("West");
			} else if (super.moveNorth()) {
				setDirection("North");
			} else {
				super.moveEast();
				setDirection("East");
			}
		} else {
			System.out.println("We got a problem");
		}
	}
}
