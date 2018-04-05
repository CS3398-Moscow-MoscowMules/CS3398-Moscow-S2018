package mds158.charactersheet.com.myapplication;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;

public class CreateCharacterActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);

        /**********************************************************************************
         ***********************S P I N N E R   A S S I G N M E N T*************************
         ***********************************************************************************/
        Spinner race = findViewById(R.id.race);
        race.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(this,
                R.array.race_arrays, android.R.layout.simple_spinner_item);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        race.setAdapter(raceAdapter);

        Spinner spell = findViewById(R.id.spells);
        spell.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> spellAdapter = ArrayAdapter.createFromResource(this,
                R.array.spells_arrays, android.R.layout.simple_spinner_item);
        spellAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spell.setAdapter(spellAdapter);

        Spinner classes = findViewById(R.id.classification);
        classes.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this,
                R.array.class_arrays, android.R.layout.simple_spinner_item);
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        classes.setAdapter(classAdapter);

        Spinner weapon = findViewById(R.id.weapons_spinner);
        weapon.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> weaponAdapter = ArrayAdapter.createFromResource(this,
                R.array.weapons_arrays, android.R.layout.simple_spinner_item);
        weaponAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weapon.setAdapter(weaponAdapter);

        Spinner shield = findViewById(R.id.shield_spinner);
        shield.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> shieldAdapter = ArrayAdapter.createFromResource(this,
                R.array.shield_arrays, android.R.layout.simple_spinner_item);
        shieldAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shield.setAdapter(shieldAdapter);

        Spinner armor = findViewById(R.id.armor_spinner);
        armor.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> armorAdapter = ArrayAdapter.createFromResource(this,
                R.array.armor_arrays, android.R.layout.simple_spinner_item);
        armorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        armor.setAdapter(armorAdapter);

        Spinner language = findViewById(R.id.Language);
        language.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(this,
                R.array.language_arrays, android.R.layout.simple_spinner_item);
        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        language.setAdapter(languageAdapter);

        Spinner alignment = findViewById(R.id.alignment);
        alignment.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> alignmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.alignment_arrays, android.R.layout.simple_spinner_item);
        alignmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alignment.setAdapter(alignmentAdapter);

        Spinner background = findViewById(R.id.background);
        background.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> backgroundAdapter = ArrayAdapter.createFromResource(this,
                R.array.background_arrays, android.R.layout.simple_spinner_item);
        backgroundAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        background.setAdapter(backgroundAdapter);

        SharedPreferences sharedPreference;
        Button saveButton;

        EditText name, strength, dexterity, constitution, intelligence, wisdom, charisma;

        CheckBox athletics, acrobatics, sleightOfHand, stealth, arcana, history, investigation, nature,
                religion, animalHandling, insight, medicine, perception, survival, deception, intimidation,
                performance, persuasion;
        
        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());
        athletics = (CheckBox) findViewById(R.id.athletics);
        acrobatics = (CheckBox) findViewById(R.id.acrobatics);
        sleightOfHand = (CheckBox) findViewById(R.id.sleightOfHand);
        stealth = (CheckBox) findViewById(R.id.stealth);
        arcana = (CheckBox) findViewById(R.id.arcana);
        history = (CheckBox) findViewById(R.id.history);
        investigation = (CheckBox) findViewById(R.id.investigation);
        nature = (CheckBox) findViewById(R.id.nature);
        religion = (CheckBox) findViewById(R.id.religion);
        animalHandling = (CheckBox) findViewById(R.id.animalHandling);
        insight = (CheckBox) findViewById(R.id.insight);
        medicine = (CheckBox) findViewById(R.id.medicine);
        perception = (CheckBox) findViewById(R.id.perception);
        survival = (CheckBox) findViewById(R.id.survival);
        deception = (CheckBox) findViewById(R.id.deception);
        intimidation = (CheckBox) findViewById(R.id.intimidation);
        performance = (CheckBox) findViewById(R.id.performance);
        persuasion = (CheckBox) findViewById(R.id.persuasion);
        name = (EditText) findViewById(R.id.name);
        strength = (EditText) findViewById(R.id.strength);
        dexterity = (EditText) findViewById(R.id.dexterity);
        constitution = (EditText) findViewById(R.id.constitution);
        intelligence = (EditText) findViewById(R.id.intelligence);
        wisdom = (EditText) findViewById(R.id.wisdom);
        charisma = (EditText) findViewById(R.id.charisma);
        saveButton = (Button) findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                //write everything to variables
                //put functions to change variables
                //write to sharedPreferences
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
