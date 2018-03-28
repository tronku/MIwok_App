package com.example.tronku.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbers = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbers);
            }
        });

        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent family = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(family);
            }
        });

        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent color = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(color);
            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent phrases = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrases);
            }
        });
    }
}
