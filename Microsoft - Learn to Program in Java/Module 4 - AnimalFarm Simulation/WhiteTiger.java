import java.awt.*;
import java.util.Random;


public class WhiteTiger extends Critter {
    int counter;
    public int infectOthers;

    public WhiteTiger(){
        this.counter = 1;
        this.infectOthers = 0;
    }

    //Same as Tiger
    public Action getMove(CritterInfo info) {

        if (info.frontThreat()) {
            counter++;
            infectOthers++;
            return Action.INFECT;

        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL ){
            counter++;
            return Action.LEFT;

        } else if (info.getFront() == Neighbor.SAME) {
            counter++;
            return Action.RIGHT;

        }else{
            counter++;
            return Action.HOP;
        }
    }

    //Always Color.WHITE.
    public Color getColor() {

        return Color.WHITE;
    }

    //"tgr" if it hasn’t infected another Critter yet, “TGR” if it has
    // infected.
    public String toString() {

        if ( infectOthers > 0){
            return "TGR";
        }
        return "tgr";
    }
}
