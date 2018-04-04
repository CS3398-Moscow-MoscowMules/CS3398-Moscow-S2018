package mds158.charactersheet.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;

public class CreateCharacterActivity extends AppCompatActivity implements
        AdapterView.setOnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);

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

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){}
}
