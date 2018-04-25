package mds158.charactersheet.com.myapplication;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class ShowCharacter extends AppCompatActivity {
    private static PlayerCharacter character;
    private Button deleteButton;
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor prefsEditor;
    private TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_character);
        Intent intent = getIntent();
        data = (TextView) findViewById(R.id.data);
        data.setText("Name: " + character.getCharacterName() + "\n" + character.getPlayerRaceString() + " " +
                character.getPlayerClassString() + "\n" + character.getPlayerAlignment() + " " +  character.getPlayerBackgroundString() + "\nHit Points: " +
                character.getHitPoints() + "\nSpeed: " + character.getPlayerSpeed() + "\nStrength: " + character.getStrength() + "\nDexterity: " +
                character.getDexterity() + "\nConstitution: " + character.getConstitution() + "\nIntelligence: " + character.getIntelligence() + "\nWisdom: " +
                character.getWisdom() + "\nCharisma: " + character.getCharisma() + "\nKnown Languages: " + character.getPlayerLanguages() + "\nProficient in: " + character.getPlayerSkillsStrings() );

        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());
        prefsEditor = sharedPreference.edit();
        deleteButton = (Button) findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Set<String> names = sharedPreference.getStringSet("names", new HashSet<String>());
                names.remove(character.getCharacterName());
                ViewCharacterActivity.removeCharacterFromList(character.getCharacterName());
                prefsEditor.remove(character.getCharacterName()).commit();
                Toast toast = Toast.makeText(getApplicationContext(), "Character deleted successfuly", Toast.LENGTH_LONG);
                toast.show();
                Intent viewChar = new Intent(getApplicationContext(), ViewCharacterActivity.class);
                startActivity(viewChar);
            }
        });
    }

    public static void setCharacter(PlayerCharacter playerCharacter){character = playerCharacter;}
}