package com.example.tronku.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word_class> words = new ArrayList<word_class>();
        words.add(new word_class("one","lutti"));
        words.add(new word_class("two", "otiiko"));
        words.add(new word_class("three", "tolookosu"));
        words.add(new word_class("four", "oyyisa"));
        words.add(new word_class("five", "massokka"));
        words.add(new word_class("six", "temmokka"));
        words.add(new word_class("seven", "kenekaku"));
        words.add(new word_class("eight", "kawinta"));
        words.add(new word_class("nine", "wo’e"));
        words.add(new word_class("ten", "na’aacha"));

        wordAdapter itemsAdapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
