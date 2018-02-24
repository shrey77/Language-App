package com.example.shrey.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<String> phrases = new ArrayList<>();
        phrases.add(getString(R.string.phrase1));
        phrases.add(getString(R.string.phrase2));
        phrases.add(getString(R.string.phrase3));
        phrases.add(getString(R.string.phrase4));
        phrases.add(getString(R.string.phrase5));

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, phrases);

        ListView listView = (ListView) findViewById(R.id.phrasesList);

        listView.setAdapter(itemsAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
