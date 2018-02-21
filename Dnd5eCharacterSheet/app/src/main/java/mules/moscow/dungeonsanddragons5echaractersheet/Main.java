package mules.moscow.dungeonsanddragons5echaractersheet;

import android.app.Application;
import java.util.ArrayList;
import jones.scott.dnd5echaractersheet.AppDatabase;

public class Main {
    Application app = new Application();
    AppDatabase database = AppDatabase.buildDatabase(app.getApplicationContext());

    ArrayList<String> raceData=  new ArrayList<>((ArrayList<String>)database.raceDAO().loadRaces());
    ArrayList<String> classData=  new ArrayList<>((ArrayList<String>)database.classDAO().loadClasses());
    //ArrayList<String> backgroundData=  new ArrayList<>((ArrayList<String>)database.backgroundDAO().loadBackgrounds());
    //ArrayList<String> skillData=  new ArrayList<>((ArrayList<String>)database.skillDAO().loadSkills());
    //ArrayList<String> healthData=  new ArrayList<>((ArrayList<String>)database.classDAO().loadHealths());
    ArrayList<String> featureData=  new ArrayList<>((ArrayList<String>)database.classFeatureDAO().loadFeatures());
    ArrayList<String> traitData=  new ArrayList<>((ArrayList<String>)database.raceFeatureDAO().loadFeatures());
    ArrayList<String> languageData=  new ArrayList<>((ArrayList<String>)database.languageDAO().loadLanguages());
    ArrayList<String> startingLangs=  new ArrayList<>((ArrayList<String>)database.raceDAO().loadLanguages());
    //ArrayList<String> speedData=  new ArrayList<>((ArrayList<String>)database.classDAO().loadSpeeds());

    private PlayerCharacter character = new PlayerCharacter(raceData, classData,/* backgroundData, skillData, healthData, */ featureData, traitData, languageData, startingLangs /*, speedData */);

    
}
