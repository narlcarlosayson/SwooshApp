package com.example.android.swooshapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.data;

public class thirdSwoosh extends AppCompatActivity {
    public static final String stringPass = "";
    private Button beGinnerBtn;
    private Button baLlerBtn;
    private Button finishBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_swoosh);
searchViews();
       beGinnerBtn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               if(beGinnerBtn.getAlpha()!=finishBtn.getAlpha()){
                   beGinnerBtn.setAlpha(1f);
                   baLlerBtn.setAlpha(0.5f);
                   finishBtn.setAlpha(1f);
                   finishBtn.setEnabled(true);
                   finishBtn.setText("Finish");
               }
               else{
                   beGinnerBtn.setAlpha(1f);
                   baLlerBtn.setAlpha(1f);
                   finishBtn.setAlpha(0.5f);
                   finishBtn.setEnabled(false);
                   finishBtn.setText("");
               }
           }

       });
        baLlerBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(baLlerBtn.getAlpha()!= finishBtn.getAlpha() ){
                   baLlerBtn.setAlpha(1f);
                    beGinnerBtn.setAlpha(0.5f);
                    finishBtn.setAlpha(1f);
                    finishBtn.setEnabled(true);
                    finishBtn.setText("Finish");

                }
                else{
                    baLlerBtn.setAlpha(1f);
                   beGinnerBtn.setAlpha(1f);
                    finishBtn.setAlpha(0.5f);
                    finishBtn.setEnabled(false);
                    finishBtn.setText("");
                }
            }
        });

        finishBtn.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){

                String IamA = "";
                if(beGinnerBtn.getAlpha()==1f){
                    IamA = beGinnerBtn.getText().toString();
                }
              else if(baLlerBtn.getAlpha()==1f){
                    IamA =  baLlerBtn.getText().toString();
                }
                Intent Dd = new Intent();

                Dd.putExtra(stringPass, IamA);
                setResult(Activity.RESULT_OK,Dd);
                finish();
            }
        });
    }

    private void searchViews()
    {
        finishBtn = (Button) findViewById(R.id.Ffinish);
        baLlerBtn =(Button) findViewById(R.id.bBaller);
        beGinnerBtn = (Button) findViewById(R.id.bBeginner);
    }
}
