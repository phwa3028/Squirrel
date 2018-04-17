package entities;

public class BadBeast extends Entity {

    public BadBeast(int x, int y)
    {
        super(-150, x, y);
    }

    @Override
    public void nextStep()
    {
        this.xy.move(XY.getVector());
    }
}