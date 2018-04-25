package mds158.charactersheet.com.myapplication;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

import jones.scott.dnd5echaractersheet.AppDatabase;
import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    private Button createButton, viewButton;
    private static PlayerCharacter character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase database = AppDatabase.getInstance(getApplicationContext());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Beginning of code that pulls info from database and sends it to playerCharacter
        ArrayList<String> raceData = new ArrayList<>((ArrayList<String>) database.raceDAO().loadRaces());
        ArrayList<String> classData = new ArrayList<>((ArrayList<String>) database.classDAO().loadClasses());
        ArrayList<String> backgroundData = new ArrayList<>((ArrayList<String>) database.backgroundDAO().loadBackgrounds());
        ArrayList<Integer> healthData = new ArrayList<>((ArrayList<Integer>) database.classDAO().loadHealths());
        ArrayList<String> featureData = new ArrayList<>((ArrayList<String>) database.classFeatureDAO().loadFeatures());
        ArrayList<String> traitData = new ArrayList<>((ArrayList<String>) database.raceFeatureDAO().loadFeatures());
        ArrayList<String> languageData = new ArrayList<>((ArrayList<String>) database.languageDAO().loadLanguages());
        ArrayList<Integer> speedData = new ArrayList<>((ArrayList<Integer>) database.raceDAO().loadSpeeds());
        ArrayList<String> skillData = new ArrayList<>((ArrayList<String>) database.skillDAO().loadSkills());
        ArrayList<Integer> bgLangData = new ArrayList<>((ArrayList<Integer>) database.backgroundDAO().loadExtraLangs());
        ArrayList<Integer> numSkillsData = new ArrayList<>((ArrayList<Integer>) database.classDAO().loadNumSkills());

        Log.d("raceSize", Integer.toString(raceData.size()));
        Log.d("classSize", Integer.toString(classData.size()));
        Log.d("bgSize", Integer.toString(backgroundData.size()));
        Log.d("skillSize", Integer.toString(skillData.size()));
        Log.d("database", getDatabasePath("database").getAbsolutePath());

        //Log.d("findRace", database.raceDAO().loadRaceInfo("Standard Tiefling").getSubrace());

        for(int i =0; i< healthData.size(); i++){
            Log.d("healthWorking", Integer.toString(healthData.get(i)));
        }

        for(int i =0; i< raceData.size(); i++){
            Log.d("RaceName", raceData.get(i));
        }

        for(int i =0; i<speedData.size(); i++)
            Log.d("speedData", Integer.toString(speedData.get(i)));

        ArrayList<ArrayList<String>> startingLangs = new ArrayList<>();
        int i = 0;
        while (i < raceData.size()) {
            startingLangs.add(new ArrayList<String>((Arrays.asList(database.raceDAO().loadLanguage1(raceData.get(i)),
                    database.raceDAO().loadLanguage2(raceData.get(i)), database.raceDAO().loadLanguage3(raceData.get(i))))));
            Log.d("startingLangsMain", raceData.get(i) + ", " + database.raceDAO().loadLanguage1(raceData.get(i)) + ", " +
                    database.raceDAO().loadLanguage2(raceData.get(i)) + ", " + database.raceDAO().loadLanguage3(raceData.get(i)));

            i++;
        }

        ArrayList<ArrayList<Integer>> modifierData = new ArrayList<>(Arrays.asList((ArrayList<Integer>) database.raceDAO().loadStrMods(),
                (ArrayList<Integer>) database.raceDAO().loadDexMods(), (ArrayList<Integer>) database.raceDAO().loadConMods(),
                (ArrayList<Integer>) database.raceDAO().loadIntMods(), (ArrayList<Integer>) database.raceDAO().loadWisMods(),
                (ArrayList<Integer>) database.raceDAO().loadChaMods()));

        ArrayList<ArrayList<Boolean>> classSkillData = new ArrayList<>();
        i = 0;
        while (i < classData.size()) {
            classSkillData.add(new ArrayList<Boolean>(Arrays.asList(Boolean.parseBoolean(database.classDAO().loadAcrobatics(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadAnimalHandling(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadArcana(classData.get(i))),
                    Boolean.parseBoolean(database.classDAO().loadAthletics(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadDeception(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadHistory(classData.get(i))),
                    Boolean.parseBoolean(database.classDAO().loadInsight(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadIntimidation(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadInvestigation(classData.get(i))),
                    Boolean.parseBoolean(database.classDAO().loadMedicine(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadNature(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadPerception(classData.get(i))),
                    Boolean.parseBoolean(database.classDAO().loadPerformance(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadPersuasion(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadReligion(classData.get(i))),
                    Boolean.parseBoolean(database.classDAO().loadSleightOfHand(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadStealth(classData.get(i))), Boolean.parseBoolean(database.classDAO().loadSurvival(classData.get(i))))));
            i++;
        }

        ArrayList<ArrayList<String>> bgSkillData = new ArrayList<>();
        i =0;
        while(i<backgroundData.size()){
            bgSkillData.add(new ArrayList<String>(Arrays.asList(database.backgroundDAO().loadSkill1(backgroundData.get(i)), database.backgroundDAO().loadSkill2(backgroundData.get(i)))));
            i++;
        }

        character = new PlayerCharacter(raceData, classData, backgroundData, skillData, healthData,
                featureData, traitData, languageData, startingLangs, speedData, modifierData,
                classSkillData, bgSkillData, bgLangData, numSkillsData);

        createButton = findViewById(R.id.createCharButton);
        //Might need to add the view character button here later.

        createButton.setOnClickListener(this);

        viewButton = findViewById(R.id.viewCharButton);

        //View character button is set here.
        viewButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        final Context context = this;

        switch (view.getId()) {
            case R.id.createCharButton:
                Intent intentCreate = new Intent(context, CreateCharacterActivity.class);
                startActivity(intentCreate);
                break;
            case R.id.viewCharButton:
                Intent intentView = new Intent(context, ViewCharacterActivity.class);
                startActivity(intentView);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*class CreateButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            onCreateChar(v);
        }
    }
    public void onCreateChar(View view) {
        Intent myIntent = new Intent(MainActivity.this, CreateCharacterActivity.class);
        startActivity(myIntent);
    }*/

    public static PlayerCharacter getPlayerCharacter() {
        return character;
    }
}
