package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Speed {

    private int baseSpeed;
    private ArrayList<Integer> classSpeeds;

    public Speed(ArrayList<Integer> classSpeedData, int classNum){
        classSpeeds = new ArrayList<Integer>(classSpeedData);
        baseSpeed = classSpeeds.get(classNum);
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }
}
