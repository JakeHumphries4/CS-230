public class DumbTargetingEnemy extends Moveable {

    public DumbTargetingEnemy(int xPos, int yPos) {
        super(xPos, yPos);
    }

    public void move(int playerX, int playerY) {
        if (getxPos() > playerX && (Math.abs(getxPos() - playerX) > Math.abs(getyPos() - playerY)) && getCell().getWest().getCellType().equals("Ground")) {
            moveWest();
        } else if (getxPos() < playerX && (Math.abs(getxPos() - playerX) > Math.abs(getyPos() - playerY)) && getCell().getEast().getCellType().equals("Ground")) {
            moveEast();
        } else if (getyPos() > playerY && (Math.abs(getyPos() - playerY) > Math.abs(getxPos() - playerX)) && getCell().getNorth().getCellType().equals("Ground")) {
            moveNorth();
        } else if (getyPos() < playerY && (Math.abs(getyPos() - playerY) > Math.abs(getxPos() - playerX)) && getCell().getSouth().getCellType().equals("Ground")) {
            moveSouth();
        }
    }
}
