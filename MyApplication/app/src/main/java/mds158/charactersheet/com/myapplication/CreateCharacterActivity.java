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

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;



public class CreateCharacterActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private Spinner race;
    private Spinner spell;
    private Spinner classes;
    private Spinner weapon;
    private Spinner shield;
    private Spinner armor;
    private Spinner language;

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

        spell = findViewById(R.id.spells);
        spell.setOnItemSelectedListener(this);
        final ArrayAdapter<CharSequence> spellAdapter = ArrayAdapter.createFromResource(this,
                R.array.spells_arrays, android.R.layout.simple_spinner_item);
        spellAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spell.setAdapter(spellAdapter);

        classes = findViewById(R.id.classification);
        classes.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this,
                R.array.class_arrays, android.R.layout.simple_spinner_item);
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        classes.setAdapter(classAdapter);

        weapon = findViewById(R.id.weapons_spinner);
        weapon.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> weaponAdapter = ArrayAdapter.createFromResource(this,
                R.array.weapons_arrays, android.R.layout.simple_spinner_item);
        weaponAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weapon.setAdapter(weaponAdapter);

        shield = findViewById(R.id.shield_spinner);
        shield.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> shieldAdapter = ArrayAdapter.createFromResource(this,
                R.array.shield_arrays, android.R.layout.simple_spinner_item);
        shieldAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shield.setAdapter(shieldAdapter);

        armor = findViewById(R.id.armor_spinner);
        armor.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> armorAdapter = ArrayAdapter.createFromResource(this,
                R.array.armor_arrays, android.R.layout.simple_spinner_item);
        armorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        armor.setAdapter(armorAdapter);

        language = findViewById(R.id.Language);
        language.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(this,
                R.array.language_arrays, android.R.layout.simple_spinner_item);
        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        language.setAdapter(languageAdapter);

        final Spinner alignment = findViewById(R.id.alignment);
        alignment.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> alignmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.alignment_arrays, android.R.layout.simple_spinner_item);
        alignmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alignment.setAdapter(alignmentAdapter);

        final Spinner background = findViewById(R.id.background);
        background.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> backgroundAdapter = ArrayAdapter.createFromResource(this,
                R.array.background_arrays, android.R.layout.simple_spinner_item);
        backgroundAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        background.setAdapter(backgroundAdapter);

        SharedPreferences sharedPreference;
        Button saveButton;

        final EditText name, strength, dexterity, constitution, intelligence, wisdom, charisma;

        final CheckBox athletics, acrobatics, sleightOfHand, stealth, arcana, history, investigation, nature,
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

                PlayerCharacter character = MainActivity.getPlayerCharacter();
                character.setCharacterName(name.getText().toString());
                character.setPlayerRace(race.getSelectedItem().toString());
                character.setPlayerClass(classes.getSelectedItem().toString());
                character.setPlayerAlignment(alignment.getSelectedItem().toString());
                character.setPlayerBackground(background.getSelectedItem().toString());
                character.setStrength(Integer.parseInt(strength.getText().toString()));
                character.setDexterity(Integer.parseInt(dexterity.getText().toString()));
                character.setConstitution(Integer.parseInt(constitution.getText().toString()));
                character.setIntelligence(Integer.parseInt(intelligence.getText().toString()));
                character.setWisdom(Integer.parseInt(wisdom.getText().toString()));
                character.setCharisma(Integer.parseInt(charisma.getText().toString()));
                character.addLanguage(language.getSelectedItem().toString());

                character.setWeapon(weapon.getSelectedItem().toString());
                character.setArmor(armor.getSelectedItem().toString());
                character.setShield(shield.getSelectedItem().toString());
                character.setSpell(spell.getSelectedItem().toString());

                character.setSkillOptions();
                if(acrobatics.isChecked()){
                    character.addPlayerSkill("Acrobatics");
                }else if(animalHandling.isChecked()){
                    character.addPlayerSkill("Animal Handling");
                }else if(arcana.isChecked()){
                    character.addPlayerSkill("Arcana");
                }else if(athletics.isChecked()){
                    character.addPlayerSkill("Athletics");
                }else if(deception.isChecked()){
                    character.addPlayerSkill("Deception");
                }else if(history.isChecked()){
                    character.addPlayerSkill("History");
                }else if(insight.isChecked()){
                    character.addPlayerSkill("Insight");
                }else if(intimidation.isChecked()){
                    character.addPlayerSkill("Intimidation");
                }else if(investigation.isChecked()){
                    character.addPlayerSkill("Investigation");
                }else if(medicine.isChecked()){
                    character.addPlayerSkill("Medicine");
                }else if(nature.isChecked()){
                    character.addPlayerSkill("Nature");
                }else if(perception.isChecked()){
                    character.addPlayerSkill("Perception");
                }else if(performance.isChecked()){
                    character.addPlayerSkill("Performance");
                }else if(persuasion.isChecked()){
                    character.addPlayerSkill("Persuasion");
                }else if(religion.isChecked()){
                    character.addPlayerSkill("Religion");
                }else if(sleightOfHand.isChecked()){
                    character.addPlayerSkill("Sleight of Hand");
                }else if(stealth.isChecked()){
                    character.addPlayerSkill("Stealth");
                }else if(survival.isChecked()){
                    character.addPlayerSkill("Survival");
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
