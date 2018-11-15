import java.awt.*;

public class Bear extends Critter {

    private int counter;
    private boolean polar;

    public Bear(boolean polar){

        this.polar = polar;
        this.counter = 1;
    }

    //always infect if an enemy is in front, otherwise hop if possible,
    // otherwise turn left.
    public Action getMove(CritterInfo info) {

        if (info.getFront() == Neighbor.OTHER){
            counter++;
            return Action.INFECT;

        } else if (info.getFront() == Neighbor.EMPTY) {
            counter++;
            return Action.HOP;

        } else {
            counter++;
            return Action.LEFT;
        }
    }

    //Color.WHITE for a polar bear (when polar is true),
    // Color.BLACK otherwise (when polar is false)
    public Color getColor() {

        if (polar) {
            return Color.WHITE;
        }
        else{
            return Color.BLACK;
        }
    }

    //Should alternate on each different move between a slash character (/)
    // and a backslash character () starting with a slash.
    public String toString() {

        if (counter%2 == 0){
            return "/";
        }
        return " ";

    }
}
