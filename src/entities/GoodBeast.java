package entities;

public  class GoodBeast extends Entity {

    public GoodBeast(int x, int y)
        {
            super(200, x, y);
        }

        @Override
        public void nextStep()
        {
            this.xy.move(XY.getVector());
        }



}
