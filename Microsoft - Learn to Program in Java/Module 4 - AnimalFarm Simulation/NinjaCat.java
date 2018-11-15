import java.awt.*;
import java.util.Random;


public class NinjaCat extends Critter {

    public Action getMove(CritterInfo info) {

        return Action.INFECT;
    }

    public Color getColor() {

        return Color.GRAY;
    }

    public String toString() {

        return "CAT";
    }
}
