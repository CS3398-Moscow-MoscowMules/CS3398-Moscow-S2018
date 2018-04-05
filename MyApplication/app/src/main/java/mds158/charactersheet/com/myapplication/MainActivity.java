package mds158.charactersheet.com.myapplication;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

import jones.scott.dnd5echaractersheet.AppDatabase;
import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class MainActivity extends AppCompatActivity {
    private Button createButton;
    private static PlayerCharacter character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application app = new Application();
        AppDatabase database = AppDatabase.buildDatabase(app.getApplicationContext());

        addListenerOnButton();

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
        ArrayList<String> raceData=  new ArrayList<>((ArrayList<String>)database.raceDAO().loadRaces());
        ArrayList<String> classData=  new ArrayList<>((ArrayList<String>)database.classDAO().loadClasses());
        ArrayList<String> backgroundData=  new ArrayList<>((ArrayList<String>)database.backgroundDAO().loadBackgrounds());
        ArrayList<Integer> healthData=  new ArrayList<>((ArrayList<Integer>)database.classDAO().loadHealths());
        ArrayList<String> featureData=  new ArrayList<>((ArrayList<String>)database.classFeatureDAO().loadFeatures());
        ArrayList<String> traitData=  new ArrayList<>((ArrayList<String>)database.raceFeatureDAO().loadFeatures());
        ArrayList<String> languageData=  new ArrayList<>((ArrayList<String>)database.languageDAO().loadLanguages());
        ArrayList<Integer> speedData=  new ArrayList<>((ArrayList<Integer>)database.raceDAO().loadSpeeds());

        ArrayList<ArrayList<String>> startingLangs=  new ArrayList<>();
        int i =0;
        while(i< raceData.size()){
            startingLangs.add((ArrayList<String>)Arrays.asList(database.raceDAO().loadLanguage1(raceData.get(i)),
                    database.raceDAO().loadLanguage2(raceData.get(i)), database.raceDAO().loadLanguage3(raceData.get(i))));
            i++;
        }

        ArrayList<ArrayList<Integer>> modifierData = new ArrayList<>(Arrays.asList((ArrayList<Integer>)database.raceDAO().loadStrMods(),
                (ArrayList<Integer>)database.raceDAO().loadDexMods(), (ArrayList<Integer>)database.raceDAO().loadConMods(),
                (ArrayList<Integer>)database.raceDAO().loadIntMods(), (ArrayList<Integer>)database.raceDAO().loadWisMods(),
                (ArrayList<Integer>)database.raceDAO().loadChaMods()));

        character = new PlayerCharacter(raceData, classData, backgroundData, /*skillData, */healthData,
                featureData, traitData, languageData, startingLangs, speedData, modifierData/*, skillData*/);
    }

    //Will need to re-format this to allow for multiple button actions. Works for just one right now.
    public void addListenerOnButton(){
        final Context context = this;

        createButton = findViewById(R.id.createCharButton);
        //Might need to add the view character button here later.

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CreateCharacterActivity.class);
                startActivity(intent);
            }
        });

        //View character button is set here.
        //viewCharButton.setOnClickListener(new View.OnClickListener(){}
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

    public static PlayerCharacter getPlayerCharacter(){
        return character;
    }
}
