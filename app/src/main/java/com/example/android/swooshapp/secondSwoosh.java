package com.example.android.swooshapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import static android.R.attr.button;

public class secondSwoosh extends AppCompatActivity {
public Button nxtBtn;
    public void dsleague(){
        nxtBtn=(Button)findViewById(R.id.nxtBtn);

        nxtBtn.setAlpha(.5f);
        nxtBtn.setClickable(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_swoosh);

    }
}
