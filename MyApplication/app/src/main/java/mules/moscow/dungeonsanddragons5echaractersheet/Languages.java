package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Languages {

    private ArrayList<String> knownLanguages;
    private ArrayList<String> languages;
    private int extras;
    private int used;

    /**
     * The constructor for language.
     * @param languageData contains all available languages
     * @param extras the number of extra languages the player is allowed to learn
     */
    public Languages(ArrayList<String> languageData, int extras){
        languages = new ArrayList<>(languageData);

        this.extras = extras;
    }

    /**
     * returns a list of languages known by the player
     * @return the languages known by the player
     */
    public ArrayList<String> getLanguageList() {
        return knownLanguages;
    }

    public void setKnownLanguages(ArrayList<ArrayList<String>> startingLangs, int playerClass){
        knownLanguages = new ArrayList<>(startingLangs.get(playerClass));
    }

    /**
     * Adds a new language known by the player
     * @param newLang the language that the player has learned
     */
    public void addLanguage(String newLang){
        if (used < extras && !knownLanguages.contains(newLang)) {
            knownLanguages.add(newLang);
        }
    }
}