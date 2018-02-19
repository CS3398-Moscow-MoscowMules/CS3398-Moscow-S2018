package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Traits {
    private ArrayList<String> traitList;

    public Traits(ArrayList<String> traitData){
        traitList = new ArrayList<String>(traitData);
    }

    public ArrayList<String> getTraitList() {
        return traitList;
    }

}
