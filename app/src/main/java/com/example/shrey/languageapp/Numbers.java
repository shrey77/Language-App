package com.example.shrey.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Zero");
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");
        numbers.add("Eleven");
        numbers.add("Twelve");
        numbers.add("Thirteen");
        numbers.add("Fourteen");
        numbers.add("Fifteen");
        numbers.add("Sixteen");
        numbers.add("Seventeen");
        numbers.add("Eighteen");
        numbers.add("Nineteen");
        numbers.add("Twenty");
        numbers.add("Thirty");
        numbers.add("Forty");
        numbers.add("Fifty");
        numbers.add("Sixty");
        numbers.add("Seventy");
        numbers.add("Eighty");
        numbers.add("Ninety");
        numbers.add("One Hundred");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);

        ListView listView = (ListView) findViewById(R.id.numbersList);

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
