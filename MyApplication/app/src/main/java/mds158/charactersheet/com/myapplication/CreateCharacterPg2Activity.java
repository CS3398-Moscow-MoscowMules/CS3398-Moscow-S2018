package mds158.charactersheet.com.myapplication;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import com.google.gson.Gson;

import java.nio.file.StandardWatchEventKinds;
import java.util.HashSet;
import java.util.Set;
import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class CreateCharacterPg2Activity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

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

        for(int i=0; i<character.getPlayerSkillOptions().size(); i++)
            Log.d("skillOption", Boolean.toString(character.getPlayerSkillOptions().get(i)));

        for(int i=0; i<character.getPlayerLanguages().size(); i++){
            if(character.getPlayerLanguages().get(i).equals("Abyssal")){
                abyssal.setChecked(true);
                abyssal.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Aquan")){
                aquan.setChecked(true);
                aquan.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Auran")){
                auran.setChecked(true);
                auran.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Celestial")){
                celestial.setChecked(true);
                celestial.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Common")){
                common.setChecked(true);
                common.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Deep Speech")){
                deepSpeech.setChecked(true);
                deepSpeech.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Draconic")){
                draconic.setChecked(true);
                draconic.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Drow Hand Signs")){
                drowHandSigns.setChecked(true);
                drowHandSigns.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Druidic")){
                druidic.setChecked(true);
                druidic.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Dwarvish")){
                dwarvish.setChecked(true);
                dwarvish.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Elvish")){
                elvish.setChecked(true);
                elvish.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Giant")){
                giant.setChecked(true);
                giant.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Gnomish")){
                gnomish.setChecked(true);
                gnomish.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Goblin")){
                goblin.setChecked(true);
                goblin.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Gnoll")){
                gnoll.setChecked(true);
                gnoll.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Halfling")){
                halfling.setChecked(true);
                halfling.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Ignan")){
                ignan.setChecked(true);
                ignan.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Infernal")){
                infernal.setChecked(true);
                infernal.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Orc")){
                orc.setChecked(true);
                orc.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Primordial")){
                primordial.setChecked(true);
                primordial.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Silent Speech")){
                silentSpeech.setChecked(true);
                silentSpeech.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Sylvan")){
                sylvan.setChecked(true);
                sylvan.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Terran")){
                terran.setChecked(true);
                terran.setEnabled(false);
            } else if( character.getPlayerLanguages().get(i).equals("Undercommon")){
                undercommon.setChecked(true);
                undercommon.setEnabled(false);
            }
        }

        if(character.getExtraLangs() == 0){
                abyssal.setEnabled(false);
                aquan.setEnabled(false);
                auran.setEnabled(false);
                celestial.setEnabled(false);
                common.setEnabled(false);
                deepSpeech.setEnabled(false);
                draconic.setEnabled(false);
                drowHandSigns.setEnabled(false);
                druidic.setEnabled(false);
                dwarvish.setEnabled(false);
                elvish.setEnabled(false);
                giant.setEnabled(false);
                gnomish.setEnabled(false);
                goblin.setEnabled(false);
                gnoll.setEnabled(false);
                halfling.setEnabled(false);
                ignan.setEnabled(false);
                infernal.setEnabled(false);
                orc.setEnabled(false);
                primordial.setEnabled(false);
                silentSpeech.setEnabled(false);
                sylvan.setEnabled(false);
                terran.setEnabled(false);
                undercommon.setEnabled(false);
        }

        if((!character.getPlayerSkillOptions().get(0)) || character.getPlayerSkills().get(0)){
            if(character.getPlayerSkills().get(0))
                acrobatics.setChecked(true);
            acrobatics.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(1)) || character.getPlayerSkills().get(1)){
            if(character.getPlayerSkills().get(1))
                animalHandling.setChecked(true);
            animalHandling.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(2)) || character.getPlayerSkills().get(2)){
            if(character.getPlayerSkills().get(2))
                arcana.setChecked(true);
            arcana.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(3)) || character.getPlayerSkills().get(3)){
            if(character.getPlayerSkills().get(3))
                athletics.setChecked(true);
            athletics.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(4)) || character.getPlayerSkills().get(4)){
            if(character.getPlayerSkills().get(4))
                deception.setChecked(true);
            deception.setEnabled(false);
        }
        if(!character.getPlayerSkillOptions().get(5) || character.getPlayerSkills().get(5)){
            if(character.getPlayerSkills().get(5))
                history.setChecked(true);
            history.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(6)) || character.getPlayerSkills().get(6)){
            if(character.getPlayerSkills().get(6))
                insight.setChecked(true);
            insight.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(7)) || character.getPlayerSkills().get(7)){
            if(character.getPlayerSkills().get(7))
                intimidation.setChecked(true);
            intimidation.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(8)) || character.getPlayerSkills().get(8)){
            if(character.getPlayerSkills().get(8))
                investigation.setChecked(true);
            investigation.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(9)) || character.getPlayerSkills().get(9)){
            if(character.getPlayerSkills().get(9))
                medicine.setChecked(true);
            medicine.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(10)) || character.getPlayerSkills().get(10)){
            if(character.getPlayerSkills().get(10))
                nature.setChecked(true);
            nature.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(11)) || character.getPlayerSkills().get(11)){
            if(character.getPlayerSkills().get(11))
                perception.setChecked(true);
            perception.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(12)) || character.getPlayerSkills().get(12)){
            if(character.getPlayerSkills().get(12))
                performance.setChecked(true);
            performance.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(13)) || character.getPlayerSkills().get(13)){
            if(character.getPlayerSkills().get(13))
                persuasion.setChecked(true);
            persuasion.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(14)) || character.getPlayerSkills().get(14)){
            if(character.getPlayerSkills().get(14))
                religion.setChecked(true);
            religion.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(15)) || character.getPlayerSkills().get(15)){
            if(character.getPlayerSkills().get(15))
                sleightOfHand.setChecked(true);
            sleightOfHand.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(16)) || character.getPlayerSkills().get(16)){
            if(character.getPlayerSkills().get(16))
                stealth.setChecked(true);
            stealth.setEnabled(false);
        }
        if((!character.getPlayerSkillOptions().get(17)) || character.getPlayerSkills().get(17)){
            if(character.getPlayerSkills().get(17))
                survival.setChecked(true);
            survival.setEnabled(false);
        }


        saveButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                //write everything to variables
                //put functions to change variables
                //write to sharedPreferences

                character.setWeapon(weapon.getSelectedItem().toString());
                character.setArmor(armor.getSelectedItem().toString());
                character.setShield(shield.getSelectedItem().toString());
                character.setSpell(spell.getSelectedItem().toString());

                if(abyssal.isChecked())
                    character.addLanguage("Abyssal");
                if(aquan.isChecked())
                    character.addLanguage("Aquan");
                if(auran.isChecked())
                    character.addLanguage("Auran");
                if(celestial.isChecked())
                    character.addLanguage("Celestial");
                if(common.isChecked())
                    character.addLanguage("Common");
                if(deepSpeech.isChecked())
                    character.addLanguage("Deep Speech");
                if(draconic.isChecked())
                    character.addLanguage("Draconic");
                if(drowHandSigns.isChecked())
                    character.addLanguage("Drow Hand Signs");
                if(druidic.isChecked())
                    character.addLanguage("Druidic");
                if(dwarvish.isChecked())
                    character.addLanguage("Dwarvish");
                if(elvish.isChecked())
                    character.addLanguage("Elvish");
                if(giant.isChecked())
                    character.addLanguage("Giant");
                if(gnomish.isChecked())
                    character.addLanguage("Gnomish");
                if(goblin.isChecked())
                    character.addLanguage("Goblin");
                if(gnoll.isChecked())
                    character.addLanguage("Gnoll");
                if(halfling.isChecked())
                    character.addLanguage("Halfling");
                if(ignan.isChecked())
                    character.addLanguage("Ignan");
                if(infernal.isChecked())
                    character.addLanguage("Infernal");
                if(orc.isChecked())
                    character.addLanguage("Orc");
                if(primordial.isChecked())
                    character.addLanguage("Primordial");
                if(silentSpeech.isChecked())
                    character.addLanguage("Silent Speech");
                if(sylvan.isChecked())
                    character.addLanguage("Sylvan");
                if(terran.isChecked())
                    character.addLanguage("Terran");
                if(undercommon.isChecked())
                    character.addLanguage("Undercommon");

                if (acrobatics.isChecked())
                    character.addPlayerSkill("Acrobatics");

                if (animalHandling.isChecked())
                    character.addPlayerSkill("Animal Handling");

                if (arcana.isChecked())
                    character.addPlayerSkill("Arcana");

                if (athletics.isChecked())
                    character.addPlayerSkill("Athletics");

                if (deception.isChecked())
                    character.addPlayerSkill("Deception");

                if (history.isChecked())
                    character.addPlayerSkill("History");

                if (insight.isChecked())
                    character.addPlayerSkill("Insight");

                if (intimidation.isChecked())
                    character.addPlayerSkill("Intimidation");

                if (investigation.isChecked())
                    character.addPlayerSkill("Investigation");

                if (medicine.isChecked())
                    character.addPlayerSkill("Medicine");

                if (nature.isChecked())
                    character.addPlayerSkill("Nature");

                if (perception.isChecked())
                    character.addPlayerSkill("Perception");

                if (performance.isChecked())
                    character.addPlayerSkill("Performance");

                if (persuasion.isChecked())
                    character.addPlayerSkill("Persuasion");

                if (religion.isChecked())
                    character.addPlayerSkill("Religion");

                if (sleightOfHand.isChecked())
                    character.addPlayerSkill("Sleight of Hand");

                if (stealth.isChecked())
                    character.addPlayerSkill("Stealth");

                if (survival.isChecked())
                    character.addPlayerSkill("Survival");


                Gson gson = new Gson();
                String json = gson.toJson(character);
                prefsEditor.putString(name, json);
                Set<String> names = sharedPreference.getStringSet("names", new HashSet<String>());
                names.add(name);
                prefsEditor.putStringSet("names", names);
                prefsEditor.apply();
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
