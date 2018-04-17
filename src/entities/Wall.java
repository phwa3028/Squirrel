package entities;

public class Wall extends Entity
{

    public Wall(int x, int y)
    {
        super(-10, x, y);
    }

    @Override
    public void nextStep(){}
}