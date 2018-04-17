package entities;

public class BadPlant extends Entity
{
    public  BadPlant(int x, int y){
        super(-100, x, y);
    }

    @Override
    public void nextStep(){}
}

