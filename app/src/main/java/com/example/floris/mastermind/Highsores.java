package com.example.floris.mastermind;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by Floris on 4-4-2016.
 */
public class Highsores extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscores);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        for (int i = 0; i < 3; i++) {
            //Integer data = sharedPreferences.getInt("highscore", 0) ;
            //Toast.makeText(this, i + ". " + data, Toast.LENGTH_LONG).show();
        }
    }
}
