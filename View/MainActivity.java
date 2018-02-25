package mds158.charactersheet.com.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To be moved to the addListenerOnButton method.
        //createButton = findViewById(R.id.createCharButton);
        //Creates an object of type Button and calls an auxiliary class that handles the onClick.
        //createButton = new Button(this);
        //createButton.setOnClickListener(new CreateButtonClick());

        addListenerOnButton();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void addListenerOnButton(){
        final Context context = this;

        createButton = findViewById(R.id.createCharButton);
        //Might need to add the view character button here later.

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CreateCharacterActivity.class);
                startActivity(intent);
            }
        });

        //View character button is set here.
        //viewCharButton.setOnClickListener(new View.OnClickListener(){}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*class CreateButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            onCreateChar(v);
        }
    }
    public void onCreateChar(View view) {
        Intent myIntent = new Intent(MainActivity.this, CreateCharacterActivity.class);
        startActivity(myIntent);
    }*/
}
