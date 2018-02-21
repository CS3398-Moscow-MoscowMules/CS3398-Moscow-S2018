package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Languages {

    private ArrayList<String> knownLanguages;
    private ArrayList<String> languages;
    private int extras;
    private int used;

    public Languages(ArrayList<String> languageData, ArrayList<String> startingLangs, int extras){
        languages = new ArrayList<String>(languageData);
        knownLanguages = new ArrayList<String>(startingLangs);

        this.extras = extras;
    }

    public ArrayList<String> getLanguageList() {
        return knownLanguages;
    }

    public void addLanguage(String newLang){
        if (used < extras && !knownLanguages.contains(newLang)) {
            knownLanguages.add(newLang);
        }
    }
}