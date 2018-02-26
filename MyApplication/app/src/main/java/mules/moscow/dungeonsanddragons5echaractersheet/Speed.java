package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Speed {

    private int baseSpeed;
    private ArrayList<Integer> classSpeeds;

    /**
     * constructor for the Speed class
     * @param classSpeedData list of base speeds by class
     * @param classNum  the index number of the class of the player
     */
    public Speed(ArrayList<Integer> classSpeedData, int classNum){
        classSpeeds = new ArrayList<Integer>(classSpeedData);
        baseSpeed = classSpeeds.get(classNum);
    }

    /**
     * returns the player's base speed
     * @return the player's base speed
     */
    public int getBaseSpeed() {
        return baseSpeed;
    }
}
