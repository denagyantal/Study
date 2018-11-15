// Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE) and uses that color for three moves, then randomly picks one of those colors again for the next three moves, then randomly picks another one of those colors for the next three moves, and so on.

import java.awt.*;
import java.util.Random;


public class Tiger extends Critter {
    int counter;

    public Tiger(){
        this.counter=1;
    }

    //always infect if an enemy is in front, otherwise if a wall is in front or to the right,
    // then turn left, otherwise if a fellow Tiger is in front, then turn right, otherwise hop.
    public Action getMove(CritterInfo info) {

        if (info.frontThreat()) {
            counter++;
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

    //Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE) and uses that color for three moves,
    // then randomly picks one of those colors again for the next three moves, then randomly picks another one of
    // those colors for the next three moves, and so on.
    public Color getColor() {
        int random = (int) Math.random() * 3 + 1;


        if (random  == 1){

            return Color.GREEN;

        } else if (random == 2) {

            return Color.BLACK;

        }else{

            return Color.BLUE;
        }
    }

    //"TGR"
    public String toString() {

        return "TGR";
    }
}
