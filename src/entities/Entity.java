package entities;

public abstract class Entity {

    private final int id;
    private int energy;
    protected XY xy;

    //Klasse sollte wissen bei welcher Aufgabe2.Entity Id sie gerade ist
    private static int lastId = -1;

    public Entity(int energy, int x, int y){

        this.id = ++lastId;
        this.energy = energy;
        this.xy = new XY(x, y);

    }

    public abstract void nextStep();

    public void updateEnergy(int energy){
        this.energy += energy;
    }

    public int getEnergy(){
        return energy;
    }

    public XY getXY(){
        return xy;
    }

    public int getID(){
        return id;
    }

    public void move(XY vector) {
        xy = xy.move(vector);
    }

    public String toString(){
        return "ID: " + id + " Position: " + xy.toString() + " Energy: " + energy;
    }

    public boolean sameTypeCheck(Entity e){
        return this.getClass().equals(e.getClass());
    }
}
