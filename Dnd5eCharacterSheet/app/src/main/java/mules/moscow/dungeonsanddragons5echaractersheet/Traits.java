package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Traits {
    private ArrayList<String> traitList;

    /**
     * The constructor for the Trait class
     * @param traitData the list of available traits
     */
    public Traits(ArrayList<String> traitData){
        traitList = new ArrayList<String>(traitData);
    }

    /**
     * returns the list of traits the player has
     * @return the list of traits the player has
     */
    public ArrayList<String> getTraitList() {
        return traitList;
    }

}
