package mules.moscow.dungeonsanddragons5echaractersheet;
import android.util.Log;

import java.util.ArrayList;

public class Languages {

    private ArrayList<String> knownLanguages;
    private ArrayList<String> languages;
    private ArrayList<ArrayList<String>> startingLangs;
    private ArrayList<Integer> bgLangs;
    private int numLangs =0;
    private int used;

    /**
     * The constructor for language.
     * @param languageData contains all available languages
     */
    public Languages(ArrayList<String> languageData, ArrayList<ArrayList<String>> startingLangs, ArrayList<Integer> bgLangs){
        languages = new ArrayList<>(languageData);
        this.startingLangs = new ArrayList<>(startingLangs);
        this.bgLangs = new ArrayList<>((bgLangs));
    }

    /**
     * returns a list of languages known by the player
     * @return the languages known by the player
     */
    public ArrayList<String> getLanguageList() {
        return knownLanguages;
    }

    public void setKnownLanguages(ArrayList<ArrayList<String>> startingLangs, int playerRace, int playerBg){
        knownLanguages = new ArrayList<>(startingLangs.get(playerRace));
        numLangs = bgLangs.get(playerBg);
        Log.d("numLangs Bg", Integer.toString(numLangs));
        Log.d("startingLangs", Integer.toString(playerRace) + ", " + knownLanguages.get(0) + ", " + knownLanguages.get(1) + ", " + knownLanguages.get(2));

        for(int i =0; i<knownLanguages.size(); i++){
            if(knownLanguages.get(i).equals("None"))
                knownLanguages.remove(i);
            else {
                numLangs++;
                if(knownLanguages.get(i).equals("Extra"))
                    knownLanguages.remove(i);
            }
        }

    }

    public int getNumLangs(){ return numLangs; }

    /**
     * Adds a new language known by the player
     * @param newLang the language that the player has learned
     */
    public void addLanguage(String newLang){
        if (!knownLanguages.contains(newLang)) {
            knownLanguages.add(newLang);
        }
    }
}