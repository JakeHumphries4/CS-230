public class Teleport extends Cell
{
    Teleport pair;

    public Teleport(int xCoord, int yCoord)
    {
        super(xCoord,yCoord);
        this.pair = null;
    }

    public Teleport(int xCoord, int yCoord, Teleport pair)
    {
        super(xCoord,yCoord);
        this.pair = pair;
    }

    public Teleport getPair()
    {
        return pair;
    }

    public void setPair(Teleport pair)
    {
        this.pair = pair;
    }

}

