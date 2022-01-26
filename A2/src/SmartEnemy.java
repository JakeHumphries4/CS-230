import java.util.ArrayList;
import java.util.Collections;

public class SmartEnemy extends Moveable {

    public SmartEnemy(int xPos, int yPos) {
        super(xPos, yPos);
    }

    //Use heuristics to get the cost we'll be using to compare nodes.
    private int getCost(SmartNode node, int targetX, int targetY) {
        return node.getShortestPath() + Math.abs(targetX - getxPos()) + Math.abs(targetY - getyPos());
    }

    private void updateShortestPaths(SmartNode node, int newShortest) {
        if (node != null) {
            node.setShortestPath(newShortest);

        }
    }

    private String findNextMove(int targetX, int targetY) {
        ArrayList<SmartNode> visited = new ArrayList<>();
        ArrayList<SmartNode> unvisited = new ArrayList<>();
        ArrayList<SmartNode> nodes = new ArrayList<>();
        //Start the path search with the node that the enemy is on.
        SmartNode firstNode = new SmartNode(getCell(), 0, null);
        unvisited.add(firstNode);

        boolean pathFound = false;
        SmartNode nextVisit = unvisited.get(0);
        while (!pathFound && !unvisited.isEmpty()) {
            //Get the best node to visit next.
            nextVisit = unvisited.get(0);
            for (SmartNode node : unvisited) {
                if (getCost(node, targetX, targetY) < getCost(nextVisit, targetX, targetY)) {
                    nextVisit = node;
                }
            }
            //If the next node is the goal, we have the shortest path.
            if (nextVisit.getCell().getxCoord() == targetX && nextVisit.getCell().getyCoord() == targetY) {
                pathFound = true;
            }
            //Keeps track of which nodes do not yet exist so that they can be added later.
            boolean[] exists = new boolean[4];
            //Visit the node.
            Cell northCell = nextVisit.getCell().getNorth();
            Cell eastCell = nextVisit.getCell().getEast();
            Cell southCell = nextVisit.getCell().getSouth();
            Cell westCell = nextVisit.getCell().getWest();
            //Checks if the cells already exist and updates any shorter paths.
            for (SmartNode node : nodes) {
                if (northCell == node.getCell() || eastCell == node.getCell() || southCell == node.getCell() || westCell == node.getCell()) {
                    //Mark off which direction the cell was found in.
                    if (northCell == node.getCell()) {
                        exists[0] = true;
                    } else if (eastCell == node.getCell()) {
                        exists[1] = true;
                    } else if (southCell == node.getCell()) {
                        exists[2] = true;
                    } else {
                        exists[3] = true;
                    }
                    //Updates shortest paths if applicable.
                    if (nextVisit.getShortestPath() + 1 < node.getShortestPath()) {
                        node.setPrevious(nextVisit);
                        node.setShortestPath(nextVisit.getShortestPath() + 1);
                        SmartNode dependency = node;
                        while (dependency != null) {
                            SmartNode currentNode = dependency;
                            dependency = null;
                            for (SmartNode potentialDependecy : visited) {
                                if (potentialDependecy.getPrevious() == currentNode) {
                                    potentialDependecy.setShortestPath(currentNode.getShortestPath() + 1);
                                    dependency = currentNode;
                                }
                            }
                        }
                    }
                }
            }
            //Creates any nodes explored that are not already visited and puts them in the unvisited list.
            if (!exists[0] && northCell != null) {
                SmartNode newNode = new SmartNode(northCell, nextVisit.getShortestPath() + 1, nextVisit);
                nodes.add(newNode);
                unvisited.add(newNode);
            }
            if (!exists[1] && eastCell != null) {
                SmartNode newNode = new SmartNode(eastCell, nextVisit.getShortestPath() + 1, nextVisit);
                nodes.add(newNode);
                unvisited.add(newNode);
            }
            if (!exists[2] && southCell != null) {
                SmartNode newNode = new SmartNode(southCell, nextVisit.getShortestPath() + 1, nextVisit);
                nodes.add(newNode);
                unvisited.add(newNode);
            }
            if (!exists[3] && westCell != null) {
                SmartNode newNode = new SmartNode(westCell, nextVisit.getShortestPath() + 1, nextVisit);
                nodes.add(newNode);
                unvisited.add(newNode);
            }
            //Now that we're done with the node, mark it as visited.
            visited.add(nextVisit);
        }

        //We only need the next move, so go backwards and find it.
        String nextMove = null;
        while (nextVisit != null) {
            nextMove = nextVisit.getPrevious().getCell().getDirection(nextVisit.getCell());
            nextVisit = nextVisit.getPrevious();
        }
        return nextMove;
    }

    public void move(int playerX, int playerY) {
        String move = findNextMove(playerX, playerY);
        switch (move) {
            case "North":
                moveNorth();
                break;
            case "East":
                moveEast();
                break;
            case "South":
                moveSouth();
                break;
            case "West":
                moveWest();
                break;
        }
    }
}
