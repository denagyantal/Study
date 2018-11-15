import java.awt.*;
import java.util.Random;


public class Giant extends Critter {
    int counter;

    public Giant () {

        this.counter = 1;
    }

    //always infect if an enemy is in front, otherwise hop if possible,
    // otherwise turn right.
    public Action getMove(CritterInfo info) {

        if (info.frontThreat()) {
            counter++;
            return Action.INFECT;

        } else if (info.getFront() == Neighbor.EMPTY){
            counter++;
            return Action.HOP;

        } else {
            counter++;
            return Action.RIGHT;
        }
    }

    //Color.GRAY
    public Color getColor() {

        return Color.GRAY;
    }

    //"fee" for 6 moves, then "fie" for 6 moves, then "foe" for 6 moves,
    // then "fum" for 6 moves, then repeat.
    public String toString() {
        /*
        if (counter%2 == 0 && )
        if ( 0 < counter && counter > 6){
            return "fee";
        } else if ( 6 <= counter && counter > 12) {
            return "fie";
        } else if ( 12 <= counter && counter > 18){
            return "foe";
        } else if (18 <= counter && counter > 24) {
            return "foe";
        } */
        switch (counter / 6) {
            case 0: {
                return "FEE";
            }
            case 1: {
                return "FIE";
            }
            case 2: {
                return "FOE";
            }
            default: {
                return "FUM";
            }
        }

    }
}
