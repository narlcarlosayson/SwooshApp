package com.example.android.swooshapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.swooshapp.R.id.gStarted;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gStart = (Button) findViewById(R.id.gStarted);

        gStart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent secSwooshIntent = new Intent(v.getContext(),secondSwoosh.class);
                startActivity(secSwooshIntent);
            }
                                  });


    }

}
