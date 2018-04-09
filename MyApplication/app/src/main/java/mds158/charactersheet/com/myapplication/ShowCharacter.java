package mds158.charactersheet.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mules.moscow.dungeonsanddragons5echaractersheet.PlayerCharacter;

public class ShowCharacter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_character);

        Intent intent = getIntent();
        PlayerCharacter character = (PlayerCharacter)intent.getSerializableExtra("Character");
        TextView data = (TextView) findViewById(R.id.data);
        data.setText(character.getCharacterName() + "\n" + character.getPlayerRace() + "\n" + character.getPlayerClass() +
        "\n" + character.getPlayerBackground() + "\n" + character.getPlayerSkills() + "\n" + character.getPlayerAlignment() +
        "\n" + character.getHitPoints() + "\n" + character.getPlayerFeatures() + "\n" + character.getPlayerTraits() + "\n" +
        character.getPlayerLanguages() + "\n" + character.getPlayerSpeed() + "\n" + character.getStrength() + "\n" +
        character.getDexterity() + "\n" + character.getConstitution() + "\n" + character.getIntelligence() + "\n" +
        character.getWisdom() + "\n" + character.getCharisma());
    }
}
