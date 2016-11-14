package com.prad.ejner.phonetics;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import static com.prad.ejner.phonetics.R.layout.phonetics_setup;


public class PhoneticsActivity extends Activity {

    private static final String TAG = PhoneticsActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "PhoneticsActivity onCreate() started.");

        setContentView(phonetics_setup);

        Log.i(TAG, "PhoneticsActivity setCreate() finished.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
