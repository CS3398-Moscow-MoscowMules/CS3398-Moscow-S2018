package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Features {
    private ArrayList<String> featureList;

    /**
     * The constructor for Features
     * @param featureData contains all the available features
     */
    public Features(ArrayList<String> featureData){
        featureList = new ArrayList<String>(featureData);
    }

    /**
     * Returns the complete list of features
     * @return the list of features
     */
    public ArrayList<String> getFeatureList() {
        return featureList;
    }

}
