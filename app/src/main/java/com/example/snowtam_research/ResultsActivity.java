package com.example.snowtam_research;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {

    private ArrayList<String> oaciList;
    private TextView text1, text2, text3, text4;
    private String oaci1, oaci2, oaci3, oaci4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        text1 = (TextView) findViewById(R.id.code1);
        text2 = (TextView) findViewById(R.id.code2);
        text3 = (TextView) findViewById(R.id.code3);
        text4 = (TextView) findViewById(R.id.code4);

        Intent intent = getIntent();

        oaci1 = intent.getStringExtra("OACI_1");
        oaci2 = intent.getStringExtra("OACI_2");
        oaci3 = intent.getStringExtra("OACI_3");
        oaci4 = intent.getStringExtra("OACI_4");

        if(!oaci1.isEmpty())
            text1.setText(oaci1);
        if(!oaci2.isEmpty())
            text2.setText(oaci2);
        if(!oaci3.isEmpty())
            text3.setText(oaci3);
        if(!oaci4.isEmpty())
            text4.setText(oaci4);




    }
}
