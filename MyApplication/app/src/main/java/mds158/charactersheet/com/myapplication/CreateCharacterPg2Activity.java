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
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class CreateCharacterPg2Activity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener, Serializable {

    private SharedPreferences sharedPreference;


    private Spinner spell;
    private Spinner weapon;
    private Spinner shield;
    private Spinner armor;

    private static String name;
    private static PlayerCharacter character;

    private CheckBox abyssal, aquan, auran, celestial, common, deepSpeech, draconic, drowHandSigns, druidic, dwarvish,
            elvish, giant, gnomish, goblin, gnoll, halfling, ignan, infernal, orc, primordial, silentSpeech, sylvan,
            terran, undercommon, athletics, acrobatics, sleightOfHand, stealth, arcana, history, investigation, nature,
            religion, animalHandling, insight, medicine, perception, survival, deception, intimidation,
            performance, persuasion;

    SharedPreferences.Editor prefsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character_pg2);


        /**********************************************************************************
         ***********************S P I N N E R   A S S I G N M E N T*************************
         ***********************************************************************************/


        spell = findViewById(R.id.spells);
        spell.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> spellAdapter = ArrayAdapter.createFromResource(this,
                R.array.spells_arrays, android.R.layout.simple_spinner_item);
        spellAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spell.setAdapter(spellAdapter);

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

        abyssal = (CheckBox) findViewById(R.id.Abyssal);
        aquan = (CheckBox) findViewById(R.id.Aquan);
        auran = (CheckBox) findViewById(R.id.Auran);
        celestial = (CheckBox) findViewById(R.id.Celestial);
        common = (CheckBox) findViewById(R.id.Common);
        deepSpeech = (CheckBox) findViewById(R.id.DeepSpeech);
        draconic = (CheckBox) findViewById(R.id.Draconic);
        drowHandSigns = (CheckBox) findViewById(R.id.DrowHand);
        druidic = (CheckBox) findViewById(R.id.Druidic);
        dwarvish = (CheckBox) findViewById(R.id.Dwarvish);
        elvish = (CheckBox) findViewById(R.id.Elvish);
        giant = (CheckBox) findViewById(R.id.Giant);
        gnomish = (CheckBox) findViewById(R.id.Gnomish);
        goblin = (CheckBox) findViewById(R.id.Goblin);
        gnoll = (CheckBox) findViewById(R.id.Gnoll);
        halfling = (CheckBox) findViewById(R.id.Halfling);
        ignan = (CheckBox) findViewById(R.id.Ignan);
        infernal = (CheckBox) findViewById(R.id.Infernal);
        orc = (CheckBox) findViewById(R.id.Orc);
        primordial = (CheckBox) findViewById(R.id.Primordial);
        silentSpeech = (CheckBox) findViewById(R.id.SilentSp);
        sylvan = (CheckBox) findViewById(R.id.Sylvan);
        terran = (CheckBox) findViewById(R.id.Terran);
        undercommon = (CheckBox) findViewById(R.id.Undercommon);
        final ArrayList<CheckBox> LangCheckBoxes = new ArrayList<>(Arrays.asList(abyssal, aquan, auran,
                celestial, common, deepSpeech, draconic, drowHandSigns, druidic, dwarvish, elvish,
                giant, gnomish, goblin, gnoll, halfling, ignan, infernal, orc, primordial,
                silentSpeech, sylvan, terran, undercommon));
        final ArrayList<String> LangStrings = new ArrayList<>(Arrays.asList(
                "Abyssal", "Aquan", "Auran", "Celestial", "Common", "Deep Speech", "Draconic",
                "Drow Hand Signs", "Druidic", "Dwarvish", "Elvish", "Giant", "Gnomish", "Goblin",
                "Gnoll", "Halfling", "Ignan", "Infernal", "Orc", "Primordial", "Silent Speech",
                "Sylvan", "Terran", "Undercommon"));

        Button saveButton;

        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());

        saveButton = (Button) findViewById(R.id.saveButton);

        prefsEditor = sharedPreference.edit();
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
        final ArrayList<CheckBox> SkillCheckBoxes = new ArrayList<>(Arrays.asList(acrobatics,
                animalHandling, arcana, athletics, deception, history, insight, intimidation,
                investigation, medicine, nature, perception, performance, persuasion, religion,
                sleightOfHand, stealth, survival));
        final ArrayList<String> SkillStrings = new ArrayList<>(Arrays.asList("Acrobatics",
                "Animal Handling", "Arcana", "Athletics", "Deception", "History", "Insight",
                "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance",
                "Persuasion", "Religion", "Sleight of Hand", "Stealth", "Survival"));

        for(int i=0; i<character.getPlayerLanguages().size(); i++){
            for(int j=0; j<LangCheckBoxes.size(); j++){
                if(character.getPlayerLanguages().get(i).equals(LangStrings.get(j))){
                    LangCheckBoxes.get(j).setChecked(true);
                    LangCheckBoxes.get(j).setEnabled(false);
                }
            }
        }

        Log.d("numLangs", Integer.toString(character.getNumLangs()) + ", " + Integer.toString(character.getPlayerLanguages().size()));
        if(character.getNumLangs() == character.getPlayerLanguages().size()){
            for(int i=0; i<LangCheckBoxes.size(); i++)
                LangCheckBoxes.get(i).setEnabled(false);
        }

        for(int i=0; i<SkillCheckBoxes.size(); i++){

            if((!character.getPlayerSkillOptions().get(i)) || character.getPlayerSkills().get(i)){
                if(character.getPlayerSkills().get(i))
                    SkillCheckBoxes.get(i).setChecked(true);
                SkillCheckBoxes.get(i).setEnabled(false);
            }
        }

        saveButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                //write everything to variables
                //put functions to change variables
                //write to sharedPreferences

                int langsChecked =0;
                for(int i=0; i<LangCheckBoxes.size(); i++){
                    if(LangCheckBoxes.get(i).isChecked())
                        langsChecked++;
                }

                int skillsChecked =0;
                for(int i=0; i<SkillCheckBoxes.size(); i++){
                    if(SkillCheckBoxes.get(i).isChecked())
                        skillsChecked++;
                }

                Log.d("lang c, g; skill c, g", Integer.toString(langsChecked) + ", " + Integer.toString(character.getNumLangs()) + ", " + Integer.toString(skillsChecked) + ", " + Integer.toString(character.getNumSkills()));
                if(langsChecked == character.getNumLangs() && skillsChecked == character.getNumSkills()) {
                    character.setWeapon(weapon.getSelectedItem().toString());
                    character.setArmor(armor.getSelectedItem().toString());
                    character.setShield(shield.getSelectedItem().toString());
                    character.setSpell(spell.getSelectedItem().toString());

                    for (int i = 0; i < LangCheckBoxes.size(); i++) {
                        if (LangCheckBoxes.get(i).isChecked())
                            character.addLanguage(LangStrings.get(i));
                    }

                    for (int i = 0; i < SkillCheckBoxes.size(); i++) {
                        if (SkillCheckBoxes.get(i).isChecked())
                            character.addPlayerSkill(SkillStrings.get(i));
                    }

                    Gson gson = new Gson();
                    String json = gson.toJson(character);
                    prefsEditor.putString(name, json);
                    Set<String> names = sharedPreference.getStringSet("names", new HashSet<String>());
                    names.add(name);
                    prefsEditor.putStringSet("names", names);
                    prefsEditor.apply();

                    Toast toast = Toast.makeText(getApplicationContext(), "Character saved successfuly", Toast.LENGTH_LONG);
                    toast.show();

                    Intent intent = new Intent(getApplicationContext(), ShowCharacter.class);
                    ShowCharacter.setCharacter(character);
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please select " + Integer.toString(character.getNumLangs()) + " languages and " + Integer.toString(character.getNumSkills()) + " skills", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }

    public static void setName(String playerName){name = playerName;}

    public static void setCharacter(PlayerCharacter playerCharacter){character = playerCharacter;}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}
