package com.example.snowtam_research;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText mOACI_code1, mOACI_code2, mOACI_code3, mOACI_code4;
    private ImageButton addImgBtn1, addImgBtn2, addImgBtn3, addImgBtn4;
    private Button researchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOACI_code1 = (EditText) findViewById(R.id.oaciCode1);
        mOACI_code2 = (EditText) findViewById(R.id.oaciCode2);
        mOACI_code3 = (EditText) findViewById(R.id.oaciCode3);
        mOACI_code4 = (EditText) findViewById(R.id.oaciCode4);

        addImgBtn1 = (ImageButton) findViewById(R.id.addImgBtn1);
        addImgBtn2 = (ImageButton) findViewById(R.id.addImgBtn2);
        addImgBtn3 = (ImageButton) findViewById(R.id.addImgBtn3);
        addImgBtn4 = (ImageButton) findViewById(R.id.addImgBtn4);

        researchBtn = (Button) findViewById(R.id.researchBtn);

        addImgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOACI_code1.getText().toString().length() == 4) {

                    mOACI_code1.setEnabled(false);
                    mOACI_code1.setKeyListener(null);
                    mOACI_code2.setVisibility(View.VISIBLE);
                    addImgBtn2.setVisibility(View.VISIBLE);
                    researchBtn.setEnabled(true);

                    addImgBtn1.setImageResource(R.drawable.tick_inside_circle);
                } else {

                    String warnig_msg = getResources().getString(R.string.warning_msg);
                    Toast toast = Toast.makeText(getApplicationContext(), warnig_msg, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        addImgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOACI_code2.getText().toString().length() == 4) {

                    mOACI_code2.setEnabled(false);
                    mOACI_code2.setKeyListener(null);
                    mOACI_code3.setVisibility(View.VISIBLE);
                    addImgBtn3.setVisibility(View.VISIBLE);

                    addImgBtn2.setImageResource(R.drawable.tick_inside_circle);
                } else {

                    String warnig_msg = getResources().getString(R.string.warning_msg);
                    Toast toast = Toast.makeText(getApplicationContext(), warnig_msg, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        addImgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOACI_code3.getText().toString().length() == 4) {

                    mOACI_code3.setEnabled(false);
                    mOACI_code3.setKeyListener(null);
                    mOACI_code4.setVisibility(View.VISIBLE);
                    addImgBtn4.setVisibility(View.VISIBLE);

                    addImgBtn3.setImageResource(R.drawable.tick_inside_circle);
                } else {

                    String warnig_msg = getResources().getString(R.string.warning_msg);
                    Toast toast = Toast.makeText(getApplicationContext(), warnig_msg, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        addImgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOACI_code4.getText().toString().length() == 4) {

                    mOACI_code4.setEnabled(false);
                    mOACI_code4.setKeyListener(null);
                    addImgBtn4.setImageResource(R.drawable.tick_inside_circle);
                } else {

                    String warnig_msg = getResources().getString(R.string.warning_msg);
                    Toast toast = Toast.makeText(getApplicationContext(), warnig_msg, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        researchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Bouton cliqué", Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }
}
