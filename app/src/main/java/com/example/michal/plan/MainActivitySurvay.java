package com.example.michal.plan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivitySurvay extends AppCompatActivity {

    private RadioGroup aimRadioGrup,healthRadioGrup,typDietRadioGrup,
            typDiabetsRadioGrup,activityRadioGrup,sexRadioGrup;
    private SeekBar weightSeekBar,heightSeekBar,ageSeekBar;
    private EditText nameEditText, passEditText;
    private TextView weightTextView,heightTextView,ageTextView;

    private boolean flag = false;
    ViewFlipper flipper;
    private int countLayout =1;

    private String userName,passWord;
    private int weight, height, age;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_survay);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        createComponentsAllLayouts();

        flipper = (ViewFlipper)findViewById(R.id.solvayViewFlipper);//inicialize ViewFlipper


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    flipper.showNext();

            }
        });
    }




    /*
        Method createComponentsAllLayouts inicialize all components in content_main_activity_survay
        And add Listener class
     */
    private void createComponentsAllLayouts(){
        aimRadioGrup = (RadioGroup) findViewById(R.id.aimRadioGrup);
        healthRadioGrup = (RadioGroup) findViewById(R.id.healthRadioGrup);
        typDietRadioGrup = (RadioGroup) findViewById(R.id.typDietRadioGrup);
        typDiabetsRadioGrup = (RadioGroup) findViewById(R.id.typDiabetsRadioGrup);
        activityRadioGrup = (RadioGroup) findViewById(R.id.activityRadioGrup);
        sexRadioGrup = (RadioGroup) findViewById(R.id.sexRadioGrup);

        weightSeekBar = (SeekBar)findViewById(R.id.weightSeekBar);
        heightSeekBar = (SeekBar)findViewById(R.id.heightSeekBar);
        ageSeekBar = (SeekBar)findViewById(R.id.ageSeekBar);

        nameEditText = (EditText)findViewById(R.id.nameEditText);
        passEditText = (EditText)findViewById(R.id.passEditText);

        weightTextView = (TextView)findViewById(R.id.weightTextView);
        heightTextView = (TextView)findViewById(R.id.heightTextView);
        ageTextView = (TextView)findViewById(R.id.ageTextView);


        aimRadioGrup.setOnCheckedChangeListener(onCheckedChangeListener);
        healthRadioGrup.setOnCheckedChangeListener(onCheckedChangeListener);
        typDietRadioGrup.setOnCheckedChangeListener(onCheckedChangeListener);
        typDiabetsRadioGrup.setOnCheckedChangeListener(onCheckedChangeListener);
        activityRadioGrup.setOnCheckedChangeListener(onCheckedChangeListener);
        sexRadioGrup.setOnCheckedChangeListener(onCheckedChangeListener);

        weightSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        heightSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        ageSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);



    }



    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };


    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

        }
    };


    private boolean isCheckStart(){
        userName = nameEditText.getText().toString();
        passWord = passEditText.getText().toString();
        if(userName.equals("")){
            nameEditText.setBackgroundColor(Color.RED);
            return false;
        }else if(passWord.equals("")){
            passEditText.setBackgroundColor(Color.RED);
            return false;
        }else {
            flag = true;
            return true;
        }


    }




}
