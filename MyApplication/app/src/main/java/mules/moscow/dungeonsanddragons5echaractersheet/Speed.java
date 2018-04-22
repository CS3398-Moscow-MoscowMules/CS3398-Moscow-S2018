package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Speed {

    private int baseSpeed;
    private ArrayList<Integer> raceSpeeds;

    /**
     * constructor for the Speed class
     * @param raceSpeedData list of base speeds by class
     */
    public Speed(ArrayList<Integer> raceSpeedData){
        if(!raceSpeedData.isEmpty()){
            raceSpeeds = new ArrayList<Integer>(raceSpeedData);

        }
    }

    /**
     * returns the player's base speed
     * @return the player's base speed
     */
    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void updateBaseSpeed(int classNum){ baseSpeed = raceSpeeds.get(classNum);}
}
