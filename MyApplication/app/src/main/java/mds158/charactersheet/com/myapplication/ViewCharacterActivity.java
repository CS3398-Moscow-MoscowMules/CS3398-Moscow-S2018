package mds158.charactersheet.com.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class ViewCharacterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private SharedPreferences sharedPreference;
    private Spinner view;
    private Set<String> names;
    private static ArrayList<String> characterList;
    private Button viewButton;

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_character);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());
        names = sharedPreference.getStringSet("names", null);
        view = findViewById(R.id.names);
        characterList = new ArrayList<>(names);
        view.setOnItemSelectedListener(this);
        ArrayAdapter<String> viewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, characterList);
        viewAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        view.setAdapter(viewAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        viewButton = (Button) findViewById(R.id.viewButton);
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                final View.OnClickListener context = this;
                String text = view.getSelectedItem().toString();
                Gson gson = new Gson();
                String json = sharedPreference.getString(text, "");
                PlayerCharacter character = gson.fromJson(json, PlayerCharacter.class);
                Intent intent = new Intent(getApplicationContext(), ShowCharacter.class);
                ShowCharacter.setCharacter(character);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public static void removeCharacterFromList(String name){
        for(int i=0; i<characterList.size(); i++){
            if(characterList.get(i).equals(name)) {
                characterList.remove(i);
                break;
            }
        }
    }
}
