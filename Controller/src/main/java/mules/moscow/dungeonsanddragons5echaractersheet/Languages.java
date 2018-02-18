package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Languages {

    private ArrayList<String> languageList;
    private ArrayList<String> standardLanguages;
    private ArrayList<String> exoticLanguages;
    private int extraLang;
    private int usedExtras;

    public Languages(ArrayList<String> standardData, ArrayList<String> exoticData, ArrayList<String> startingLangs, int extras){
        standardLanguages = new ArrayList<String>(standardData);
        exoticLanguages = new ArrayList<String>(exoticData);
        languageList = new ArrayList<String>();
        extraLang = extras;
        usedExtras = 0;

        while(!startingLangs.isEmpty()) {
            char lang = startingLangs.get(0).charAt(0);
            startingLangs.set(0, startingLangs.get(0).substring(1));
            if (lang == 's'){
                languageList.add(standardLanguages.get(Integer.parseInt(startingLangs.get(0))));
                startingLangs.remove(0);
            } else if(lang == 'e') {
                languageList.add(exoticLanguages.get(Integer.parseInt(startingLangs.get(0))));
                startingLangs.remove(0);
            }
        }
    }

    public ArrayList<String> getLanguageList() {
        return languageList;
    }

    public void addLanguage(String newLang){
        if(usedExtras<extraLang){
            char lang = newLang.charAt(0);
            newLang = newLang.substring(1);
            if (lang == 's')
                languageList.add(standardLanguages.get(Integer.parseInt(newLang)));
            else if(lang == 'e')
                languageList.add(exoticLanguages.get(Integer.parseInt(newLang)));
            usedExtras++;
        }
    }
}