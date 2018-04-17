package entities;

public class MasterSquirrel extends Entity {


    protected MasterSquirrel(int x, int y) {
        super(1000, x, y);
    }

    public boolean isChild(MiniSquirrel child) {
        return this.getID() == child.getMasterID();

    }

    @Override
    public void nextStep()
    {

    }
    public String toString(){
        return this.getID()+ " x:" + this.xy.getX() + " y:" + this.xy.getY() + " energy:" + this.getEnergy();
    }

}
