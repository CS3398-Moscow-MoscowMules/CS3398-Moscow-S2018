package mules.moscow.dungeonsanddragons5echaractersheet;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;

import jones.scott.dnd5echaractersheet.AppDatabase;

public class Main {
    Application app = new Application();
    AppDatabase database = AppDatabase.buildDatabase(app.getApplicationContext());

/*    ArrayList<String> raceData=  new ArrayList<>((ArrayList<String>)database.raceDAO().loadRaces());
    ArrayList<String> classData=  new ArrayList<>((ArrayList<String>)database.classDAO().loadClasses());
    //ArrayList<String> backgroundData=  new ArrayList<>((ArrayList<String>)database.backgroundDAO().loadBackgrounds());
    //ArrayList<String> skillData=  new ArrayList<>((ArrayList<String>)database.skillDAO().loadSkills());
    ArrayList<Integer> healthData=  new ArrayList<>((ArrayList<Integer>)database.classDAO().loadHealths());
    ArrayList<String> featureData=  new ArrayList<>((ArrayList<String>)database.classFeatureDAO().loadFeatures());
    ArrayList<String> traitData=  new ArrayList<>((ArrayList<String>)database.raceFeatureDAO().loadFeatures());
    ArrayList<String> languageData=  new ArrayList<>((ArrayList<String>)database.languageDAO().loadLanguages());
    ArrayList<String> startingLangs=  new ArrayList<>((ArrayList<String>)database.raceDAO().loadLanguages());
    ArrayList<Integer> speedData=  new ArrayList<>((ArrayList<Integer>)database.raceDAO().loadSpeeds());*/


    ArrayList<ArrayList<Integer>> modifierData = new ArrayList<>(Arrays.asList((ArrayList<Integer>)database.raceDAO().loadStrMods(),
            (ArrayList<Integer>)database.raceDAO().loadDexMods(), (ArrayList<Integer>)database.raceDAO().loadConMods(),
            (ArrayList<Integer>)database.raceDAO().loadIntMods(), (ArrayList<Integer>)database.raceDAO().loadWisMods(),
            (ArrayList<Integer>)database.raceDAO().loadChaMods()));

    private PlayerCharacter character = new PlayerCharacter((ArrayList<String>)database.raceDAO().loadRaces(), (ArrayList<String>)database.classDAO().loadClasses(),
            /* (ArrayList<String>)database.backgroundDAO().loadBackgrounds(), (ArrayList<String>)database.skillDAO().loadSkills(),*/ (ArrayList<Integer>)database.classDAO().loadHealths(),
            (ArrayList<String>)database.classFeatureDAO().loadFeatures(), (ArrayList<String>)database.raceFeatureDAO().loadFeatures(),
            (ArrayList<String>)database.languageDAO().loadLanguages()/*, startingLangs*/, (ArrayList<Integer>)database.raceDAO().loadSpeeds(),
            modifierData/*, database.raceDAO().loadSkills()*/);


}
