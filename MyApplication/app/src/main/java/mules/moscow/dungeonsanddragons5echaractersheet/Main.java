package mules.moscow.dungeonsanddragons5echaractersheet;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;

import jones.scott.dnd5echaractersheet.AppDatabase;

public class Main {
    Application app = new Application();
    AppDatabase database = AppDatabase.buildDatabase(app.getApplicationContext());
    Alignments alignments = new Alignments();

    ArrayList<String> raceData=  new ArrayList<>((ArrayList<String>)database.raceDAO().loadRaces());
    ArrayList<String> classData=  new ArrayList<>((ArrayList<String>)database.classDAO().loadClasses());
    //ArrayList<String> backgroundData=  new ArrayList<>((ArrayList<String>)database.backgroundDAO().loadBackgrounds());
    ArrayList<String> backgroundData=  new ArrayList<>(Arrays.asList("background1", "background2", "background3"));
    //ArrayList<String> skillData=  new ArrayList<>((ArrayList<String>)database.skillDAO().loadSkills());
    ArrayList<Integer> healthData=  new ArrayList<>((ArrayList<Integer>)database.classDAO().loadHealths());
    ArrayList<String> featureData=  new ArrayList<>((ArrayList<String>)database.classFeatureDAO().loadFeatures());
    ArrayList<String> traitData=  new ArrayList<>((ArrayList<String>)database.raceFeatureDAO().loadFeatures());
    ArrayList<String> languageData=  new ArrayList<>((ArrayList<String>)database.languageDAO().loadLanguages());

    ArrayList<Integer> speedData=  new ArrayList<>((ArrayList<Integer>)database.raceDAO().loadSpeeds());
    ArrayList<String> alignmentList = alignments.getAlignmentList();
    /*
    ArrayList<ArrayList<String>> startingLangs=  new ArrayList<>();
    int i =0;
    while(i< raceData.size()){
        startingLangs.add(Arrays.asList(database.raceDAO().loadLanguage1(raceData.get(i))), database.raceDAO().loadLanguage2(raceData.get(i))), database.raceDAO().loadLanguage3(raceData.get(i))))
        i++;
    }
     */
    ArrayList<ArrayList<Integer>> modifierData = new ArrayList<>(Arrays.asList((ArrayList<Integer>)database.raceDAO().loadStrMods(),
            (ArrayList<Integer>)database.raceDAO().loadDexMods(), (ArrayList<Integer>)database.raceDAO().loadConMods(),
            (ArrayList<Integer>)database.raceDAO().loadIntMods(), (ArrayList<Integer>)database.raceDAO().loadWisMods(),
            (ArrayList<Integer>)database.raceDAO().loadChaMods()));

    DatabaseToGui dbToGui = new DatabaseToGui(raceData, classData, backgroundData, alignmentList, languageData);

    private PlayerCharacter character = new PlayerCharacter(raceData, classData, /*backgroundData, skillData, */healthData,
            featureData, traitData, languageData, /*startingLangs, */speedData, modifierData/*, skillData*/);


}
