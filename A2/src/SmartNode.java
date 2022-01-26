public class SmartNode {
    private Cell cell;
    private int shortestPath;
    private SmartNode previous;

    public SmartNode(Cell cell, int shortestPath, SmartNode previous) {
        this.cell = cell;
        this.shortestPath = shortestPath;
        this.previous = previous;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public int getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(int shortestPath) {
        this.shortestPath = shortestPath;
    }

    public SmartNode getPrevious() {
        return previous;
    }

    public void setPrevious(SmartNode previous) {
        this.previous = previous;
    }
}
