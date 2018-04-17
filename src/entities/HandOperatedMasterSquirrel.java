package entities;

import java.util.Scanner;

public class HandOperatedMasterSquirrel extends Entity {
    public HandOperatedMasterSquirrel(int x, int y) {
        super(x, y, 1000);
    }

    @Override
    public void nextStep() {
        this.handOperation();
    }

    private void handOperation() {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "w":
                this.move(new XY(this.xy.getX() - 1,
                        this.xy.getY()));
                break;
            case "a":
                this.move(new XY(this.xy.getX(),
                        this.xy.getY() - 1));
                break;
            case "d":
                this.move(new XY(this.xy.getX(),
                        this.xy.getY() + 1));
                break;
            case "s":
                this.move(new XY(this.xy.getX() + 1,
                        this.xy.getY()));
                break;
        }
    }

    public String toString() {
        return this.getID() + "x:" + this.xy.getX() +
                " y:" + this.xy.getY() + " energy:" +
                this.getEnergy();
    }
}
