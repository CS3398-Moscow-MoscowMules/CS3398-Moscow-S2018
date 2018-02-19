package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Features {
    private ArrayList<String> featureList;

    public Features(ArrayList<String> featureData){
        featureList = new ArrayList<String>(featureData);
    }

    public ArrayList<String> getFeatureList() {
        return featureList;
    }

}
