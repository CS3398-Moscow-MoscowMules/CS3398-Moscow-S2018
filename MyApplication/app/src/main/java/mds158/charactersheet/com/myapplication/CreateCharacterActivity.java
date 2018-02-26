package mds158.charactersheet.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class CreateCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);

        //******TEAM, This code is still being finnicky, Payton and I are working on a solution.
        //
        /*
        Spinner race = (Spinner) findViewById(R.id.race);
        race.setOnItemSelectedListener(this);
        ArrayAdapter<String> raceAdapter = ArrayAdapter.createFromResource(this,
                R.array.race_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        race.setAdapter(raceAdapter);
        Spinner background = (Spinner) findViewById(R.id.background);
        background.setOnItemSelectedListener(this);
        ArrayAdapter<String> backgroundAdapter = ArrayAdapter.createFromResource(this,
                R.array.background_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        background.setAdapter(backgroundAdapter);
        Spinner alignment = (Spinner) findViewById(R.id.alignment);
        alignment.setOnItemSelectedListener(this);
        ArrayAdapter<String> alignmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.alignment_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alignment.setAdapter(alignmentAdapter);
        Spinner language = (Spinner) findViewById(R.id.Language);
        language.setOnItemSelectedListener(this);
        ArrayAdapter<String> languageAdapter = ArrayAdapter.createFromResource(this,
                R.array.language_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        language.setAdapter(languageAdapter);
        Spinner armor = (Spinner) findViewById(R.id.armor_spinner);
        armor.setOnItemSelectedListener(this);
        ArrayAdapter<String> armorAdapter = ArrayAdapter.createFromResource(this,
                R.array.armor_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        armor.setAdapter(armorAdapter);
        Spinner shield = (Spinner) findViewById(R.id.shield_spinner);
        shield.setOnItemSelectedListener(this);
        ArrayAdapter<String> shieldAdapter = ArrayAdapter.createFromResource(this,
                R.array.shield_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shield.setAdapter(shieldAdapter);
        Spinner spell = (Spinner) findViewById(R.id.spells);
        spell.setOnItemSelectedListener(this);
        ArrayAdapter<String> spellAdapter = ArrayAdapter.createFromResource(this,
                R.array.spells_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spell.setAdapter(spellAdapter);
        Spinner weapon = (Spinner) findViewById(R.id.weapons_spinner);
        weapon.setOnItemSelectedListener(this);
        ArrayAdapter<String> weaponAdapter = ArrayAdapter.createFromResource(this,
                R.array.weapons_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weapon.setAdapter(weaponAdapter);
        Spinner class = (Spinner) findViewById(R.id.classification);
        class.setOnItemSelectedListener(this);
        ArrayAdapter<String> classAdapter = ArrayAdapter.createFromResource(this,
                R.array.class_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        class.setAdapter(classAdapter);
        */
    }
}
