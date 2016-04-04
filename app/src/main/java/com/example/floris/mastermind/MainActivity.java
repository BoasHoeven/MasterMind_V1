package com.example.floris.mastermind;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private SharedPreferences preferenceSettings;
    private SharedPreferences.Editor preferenceEditor;
    private static final int PREFERENCE_MODE_PRIVATE = 0;
    private void LoadPreferences(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        for (int i = 0; i < 3; i++) {
            String data = sharedPreferences.getString("highscore_naam"+i, "nothing found") ;
            Toast.makeText(this,i + ". "  +data, Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadPreferences();
    }
    public void OnClickStart(View v) {
        if (v.getId() == R.id.button)
        {
           Intent i = new Intent(MainActivity.this, Start.class);
           startActivity(i);
        }
    }


public void onClickHighscore(View v){
    if (v.getId() == R.id.button2)
    {
        Intent i = new Intent(MainActivity.this, Highsores.class);
        startActivity(i);
    }

}



}
