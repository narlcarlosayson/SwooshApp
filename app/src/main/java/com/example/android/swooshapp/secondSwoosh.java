package com.example.android.swooshapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class secondSwoosh extends AppCompatActivity {
    private Button mensBtn;
    private Button womensBtn;
    private Button co_edBtn;
    private Button nxtBtn;
    private Button bgNext;
    private TextView Itxt;
    private TextView emptxt;
    public static final String StringPass = "";
    public static final int REQ_code = 1111;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_swoosh);
        searchViews();

        mensBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mensBtn.getAlpha() != nxtBtn.getAlpha()) {
                    mensBtn.setAlpha(1f);
                    womensBtn.setAlpha(0.5f);
                    co_edBtn.setAlpha(0.5f);
                    nxtBtn.setAlpha(1f);
                    bgNext.setEnabled(true);

                }
                else if(emptxt.getText().toString().isEmpty()){
                    mensBtn.setAlpha(1f);
                    womensBtn.setAlpha(1f);
                    co_edBtn.setAlpha(1f);
                    nxtBtn.setAlpha(0.5f);
                    nxtBtn.setEnabled(false);
                }
            }
        });
        womensBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (womensBtn.getAlpha() != nxtBtn.getAlpha()) {
                    mensBtn.setAlpha(0.5f);
                    womensBtn.setAlpha(1f);
                    co_edBtn.setAlpha(0.5f);
                    nxtBtn.setAlpha(1f);
                    nxtBtn.setEnabled(true);
                } else if (emptxt.getText().toString().isEmpty()){
                    mensBtn.setAlpha(1f);
                    womensBtn.setAlpha(1f);
                    co_edBtn.setAlpha(1f);
                    nxtBtn.setAlpha(0.5f);
                    nxtBtn.setEnabled(false);
                }
            }
        });

        co_edBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (co_edBtn.getAlpha() != nxtBtn.getAlpha()) {
                    mensBtn.setAlpha(0.5f);
                    womensBtn.setAlpha(0.5f);
                    co_edBtn.setAlpha(1f);
                    nxtBtn.setAlpha(1f);
                    nxtBtn.setEnabled(false);
                } else if (emptxt.getText().toString().isEmpty()){
                    mensBtn.setAlpha(1f);
                    womensBtn.setAlpha(1f);
                    co_edBtn.setAlpha(1f);
                    nxtBtn.setAlpha(0.5f);
                    nxtBtn.setEnabled(true);
                }
            }

        });

        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thrdSwooshIntent = new Intent(v.getContext(), thirdSwoosh.class);
                startActivityForResult(thrdSwooshIntent, REQ_code);
            }
        });
    }


    private void searchViews() {
        mensBtn = (Button) findViewById(R.id.mensBtn);
        womensBtn = (Button) findViewById(R.id.womensBtn);
        co_edBtn = (Button) findViewById(R.id.coedBtn);
        nxtBtn = (Button) findViewById(R.id.nxtBtn);
        Itxt = (TextView) findViewById(R.id.iamatxtleague);
        emptxt = (TextView) findViewById(R.id.ialeague);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQ_code) {
                String msgreply = data.getStringExtra(thirdSwoosh.stringPass);
                Itxt.setVisibility(View.VISIBLE);
                emptxt.setVisibility(View.VISIBLE);
                emptxt.setText(msgreply);
                nxtBtn.setVisibility(View.GONE);
                if(mensBtn.getAlpha()!=1f)
                    mensBtn.setEnabled(false);
                if(womensBtn.getAlpha()!=1f)
                    womensBtn.setEnabled(false);
                if(co_edBtn.getAlpha()!=1f)
                    co_edBtn.setEnabled(false);

            }


        }

    }
}
