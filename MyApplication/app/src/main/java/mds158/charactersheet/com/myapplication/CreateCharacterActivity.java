package mds158.charactersheet.com.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class CreateCharacterActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private SharedPreferences sharedPreference;

    private Spinner race;
    private Spinner classes;
    private Spinner background;
    private Spinner alignment;

    private EditText name, strength, dexterity, constitution, intelligence, wisdom, charisma;

    SharedPreferences.Editor prefsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);

        /**********************************************************************************
         ***********************S P I N N E R   A S S I G N M E N T*************************
         ***********************************************************************************/

        race = findViewById(R.id.race);
        race.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(this,
                R.array.race_arrays, android.R.layout.simple_spinner_item);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        race.setAdapter(raceAdapter);

        classes = findViewById(R.id.classification);
        classes.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this,
                R.array.class_arrays, android.R.layout.simple_spinner_item);
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        classes.setAdapter(classAdapter);

        alignment = findViewById(R.id.alignment);
        alignment.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> alignmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.alignment_arrays, android.R.layout.simple_spinner_item);
        alignmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alignment.setAdapter(alignmentAdapter);

        background = findViewById(R.id.background);
        background.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> backgroundAdapter = ArrayAdapter.createFromResource(this,
                R.array.background_arrays, android.R.layout.simple_spinner_item);
        backgroundAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        background.setAdapter(backgroundAdapter);


        Button nextButton;

        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());
        name = (EditText) findViewById(R.id.name);
        strength = (EditText) findViewById(R.id.strength);
        dexterity = (EditText) findViewById(R.id.dexterity);
        constitution = (EditText) findViewById(R.id.constitution);
        intelligence = (EditText) findViewById(R.id.intelligence);
        wisdom = (EditText) findViewById(R.id.wisdom);
        charisma = (EditText) findViewById(R.id.charisma);
        nextButton = (Button) findViewById(R.id.nextButton);

        prefsEditor = sharedPreference.edit();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                //write everything to variables
                //put functions to change variables
                //write to sharedPreferences
                boolean inBounds = (Integer.parseInt(strength.getText().toString())>=1 &&
                        Integer.parseInt(strength.getText().toString()) <=20) &&
                        (Integer.parseInt(dexterity.getText().toString())>=1 &&
                        Integer.parseInt(dexterity.getText().toString()) <=20) &&
                        (Integer.parseInt(constitution.getText().toString())>=1 &&
                        Integer.parseInt(constitution.getText().toString()) <=20) &&
                        (Integer.parseInt(intelligence.getText().toString())>=1 &&
                        Integer.parseInt(intelligence.getText().toString()) <=20) &&
                        (Integer.parseInt(wisdom.getText().toString())>=1 &&
                        Integer.parseInt(wisdom.getText().toString()) <=20) &&
                        (Integer.parseInt(charisma.getText().toString())>=1 &&
                        Integer.parseInt(charisma.getText().toString()) <=20);

                if((inBounds)) {
                    PlayerCharacter character = MainActivity.getPlayerCharacter();
                    character.setCharacterName(name.getText().toString());
                    CreateCharacterPg2Activity.setName(name.getText().toString());
                    character.setPlayerRace(race.getSelectedItem().toString());
                    character.setPlayerClass(classes.getSelectedItem().toString());
                    character.setPlayerAlignment(alignment.getSelectedItem().toString());
                    character.setPlayerBackground(background.getSelectedItem().toString());
                    character.updatePlayerSpeed();
                    character.updateHitPoints();
                    character.setSkillOptions();
                    character.setLanguageOptions();
                    character.setStrength(Integer.parseInt(strength.getText().toString()));
                    character.setDexterity(Integer.parseInt(dexterity.getText().toString()));
                    character.setConstitution(Integer.parseInt(constitution.getText().toString()));
                    character.setIntelligence(Integer.parseInt(intelligence.getText().toString()));
                    character.setWisdom(Integer.parseInt(wisdom.getText().toString()));
                    character.setCharisma(Integer.parseInt(charisma.getText().toString()));

                    Log.d("checkClass", Integer.toString(character.getPlayerClass()));
                    Log.d("checkRace", Integer.toString(character.getPlayerRace()));
                    Log.d("checkAlignment", character.getPlayerAlignment());
                    Log.d("checkBackground", Integer.toString(character.getPlayerBackground()));
                    //Log.d("checkSpeed", Integer.toString(character.getPlayerSpeed().getBaseSpeed()));
                    Log.d("checkStr", Integer.toString(character.getStrength()));
                    Log.d("checkDex", Integer.toString(character.getDexterity()));
                    Log.d("checkCon", Integer.toString(character.getConstitution()));
                    Log.d("checkInt", Integer.toString(character.getIntelligence()));
                    Log.d("checkWis", Integer.toString(character.getWisdom()));
                    Log.d("checkCha", Integer.toString(character.getCharisma()));

                    CreateCharacterPg2Activity.setCharacter(character);
                    Intent intentCreatePg2 = new Intent(getApplicationContext(), CreateCharacterPg2Activity.class);
                    startActivity(intentCreatePg2);
                } else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Ability Scores must be between 1 and 20", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}
