package com.example.hackathon.movietime;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        String var = "help";
        //TextView textView = (TextView) findViewById(R.id.textView);
        //textView.setText(var);
    }

public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        final Spinner spinner_genres = (Spinner) findViewById(R.id.genres);
        String spinner_genres_data = parent.getItemAtPosition(1).toString();
        TextView textView = (TextView) findViewById(R.id.textView);
        //textView.setText(parent.getSelectedItem().toString());
        textView.setText(spinner_genres_data);
    }





    public void onNothingSelected(AdapterView<?> parent){}


}}
