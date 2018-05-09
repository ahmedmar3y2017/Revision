package com.example.ahmedmar3y.revision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtons extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);
    }


    public void RadioButtonClick(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button = (Button) findViewById(R.id.radioButton);
        radioButton1 = (RadioButton) findViewById(R.id.radio1);
        radioButton2 = (RadioButton) findViewById(R.id.radio2);


        if (radioGroup.getCheckedRadioButtonId() == -1) {

            Toast.makeText(getApplicationContext(), "Nothing selected", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(), radioButton1.getText() + "\t" + radioButton2.getText(), Toast.LENGTH_SHORT).show();

        }


    }


}
