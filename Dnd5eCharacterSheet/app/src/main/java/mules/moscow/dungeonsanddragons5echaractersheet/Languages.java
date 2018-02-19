package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Languages {

    private ArrayList<String> languageList;
    private ArrayList<String> standardLanguages;
    private ArrayList<String> exoticLanguages;
    private int classExtras;
    private int backgroundExtras;
    private int usedClassExtras;
    private int usedBGExtras;

    public Languages(ArrayList<String> standardData, ArrayList<String> exoticData, ArrayList<String> startingLangs, int cExtras, int bgExtras){
        standardLanguages = new ArrayList<String>(standardData);
        exoticLanguages = new ArrayList<String>(exoticData);
        languageList = new ArrayList<String>();

        classExtras = cExtras;
        backgroundExtras = bgExtras;
        usedClassExtras = 0;
        usedBGExtras =0;

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

    public void addLanguage(String newLang, boolean classExtra, boolean bgExtra){
        if(classExtra) {
            if (usedClassExtras < classExtras) {
                char lang = newLang.charAt(0);
                newLang = newLang.substring(1);
                if (lang == 's')
                    languageList.add(standardLanguages.get(Integer.parseInt(newLang)));
                else if (lang == 'e')
                    languageList.add(exoticLanguages.get(Integer.parseInt(newLang)));
                usedClassExtras++;
            }
        }
        else if(bgExtra){
            if (usedBGExtras < backgroundExtras) {
                char lang = newLang.charAt(0);
                newLang = newLang.substring(1);
                if (lang == 's')
                    languageList.add(standardLanguages.get(Integer.parseInt(newLang)));
                else if (lang == 'e')
                    languageList.add(exoticLanguages.get(Integer.parseInt(newLang)));
                usedBGExtras++;
            }
        }
    }
}