package mds158.charactersheet.com.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Set;
import java.util.List;

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class ViewCharacterActivity extends AppCompatActivity implements
AdapterView.OnItemSelectedListener {

    private SharedPreferences sharedPreference;
    private Spinner view;
    private Set<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_character);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());
        names = sharedPreference.getStringSet("names", null);
        view = findViewById(R.id.nameList);
        view.setOnItemSelectedListener(this);
        ArrayAdapter<String> viewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, (List<String>) names);
        viewAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        view.setAdapter(viewAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                String text = view.getSelectedItem().toString();
                Gson gson = new Gson();
                String json = sharedPreference.getString(text, "");
                PlayerCharacter character = gson.fromJson(json, PlayerCharacter.class);
                Intent showCharacter = new Intent(this, ShowCharacter.class);
                showCharacter.putExtra("Character", (Serializable) character);
                startActivity(showCharacter);


            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

}
