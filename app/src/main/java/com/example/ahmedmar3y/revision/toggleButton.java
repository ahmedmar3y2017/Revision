package com.example.ahmedmar3y.revision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class toggleButton extends AppCompatActivity {


    ToggleButton toggleButton1, toggleButton2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        onclickListener();

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(), "Values are:\n First value: " + value1 +
                "\n Second Value: " + value2, Toast.LENGTH_LONG).show();

    }

    public void onclickListener() {

        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();
                System.out.println("Done");

                stringBuilder.append("Toggle Button 1 : ").append(toggleButton1.getText());
                stringBuilder.append("Toggle Button 2 : ").append(toggleButton2.getText());
                System.out.println(stringBuilder);

                Toast.makeText(getApplicationContext(), stringBuilder.toString(), Toast.LENGTH_LONG);

                // return to main activity

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);


            }
        });


    }
}
