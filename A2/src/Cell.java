public class Cell {
    private int xCoord;
    private int yCoord;
    private Cell north;
    private Cell east;
    private Cell south;
    private Cell west;
    private String cellType;

    public Cell(int xCoord, int yCoord, String cellType)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.cellType = cellType;
    }

    public String getDirection(Cell otherCell) {
        if (otherCell == north) {
            return "North";
        } else if (otherCell == east) {
            return "East";
        } else if (otherCell == south) {
            return "South";
        } else if (otherCell == west) {
            return "West";
        } else {
            return null;
        }
    }

    public int getxCoord()
    {
        return xCoord;
    }

    public void setxCoord(int xCoord)
    {
        this.xCoord = xCoord;
    }

    public int getyCoord()
    {
        return yCoord;
    }

    public void setyCoord(int yCoord)
    {
        this.yCoord = yCoord;
    }

    public Cell getNorth() {
        return north;
    }

    public void setNorth(Cell north) {
        this.north = north;
    }

    public Cell getEast() {
        return east;
    }

    public void setEast(Cell east) {
        this.east = east;
    }

    public Cell getSouth() {
        return south;
    }

    public void setSouth(Cell south) {
        this.south = south;
    }

    public Cell getWest() {
        return west;
    }

    public void setWest(Cell west) {
        this.west = west;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }
}
