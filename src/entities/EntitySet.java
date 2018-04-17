package entities;

public class EntitySet {

    Entity[] entityArray = new Entity[40];

    public EntitySet(){

    }


    public void insert(Entity e){
        int index = -1;

        for(int i = 0; i < entityArray.length; i++){
            if(entityArray[i] == e)
                return;
            else if(entityArray[i] == null && index == -1){
                index = i;
            }
        }
        entityArray[index] = e;
    }

    public void remove(Entity e){
        for(int i = 0; i < entityArray.length; i++){
            if(entityArray[i] == e){
                entityArray[i] = null;
                break;
            }
        }
    }

    public String toString(){
        int s = 1;
        String output = "Inhalt an Stelle: ";
        for(int i = 0; i < entityArray.length; i++){
            if(entityArray[i] != null){
                output += "\n" + "-> " + entityArray[i];
            }
        }
        return output;
    }

    public void nextStep() {
        for(int i = 0; i < entityArray.length; i++) {
            Entity e = entityArray[i];
            if(e != null) {
                e.nextStep();


                if (e instanceof MasterSquirrel) {
                    checkCollisionWithGoodPlant((MasterSquirrel) e);
                }
            }
        }
    }


    private void checkCollisionWithGoodPlant(MasterSquirrel s) {
        for (Entity e2 : entityArray) {
            if (e2 instanceof GoodPlant && e2.getXY().equals(s.getXY())) {
                s.updateEnergy(e2.getEnergy());
                remove(e2);
            }
        }
    }
}
