package entities;


public class MiniSquirrel extends Entity {

    private final int masterID;

    public MiniSquirrel(int energy, int x, int y, int masterID) {
        super(energy, x, y);
        this.masterID = masterID;
    }

    public int getMasterID() {
        return masterID;
    }

    @Override
    public void nextStep()
    {

    }
    public String toString(){
        return this.getID() + "x:" + this.xy.getX() + " y:" + this.xy.getY() + " energy:" + this.getEnergy()+ " MasterID:" + this.getMasterID();
    }

}