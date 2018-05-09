package com.example.ahmedmar3y.revision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText userAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //code that displays the content in full screen mode
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//int flag, int mask

        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Hello Javatpoint", Toast.LENGTH_SHORT).show();

    }

    public void clickButton(View view) {
        System.out.println("Done Clcik");

        userName = (EditText) findViewById(R.id.username);
        userAddress = (EditText) findViewById(R.id.address);
        System.out.println(userName.getText().toString() + "     " + userAddress.getText().toString());

        int a = Integer.parseInt(userName.getText().toString());
        int b = Integer.parseInt(userAddress.getText().toString());
        Toast.makeText(getApplicationContext(), String.valueOf(a + b), Toast.LENGTH_LONG).show();


        // intent to another activity
        Intent i = new Intent(getApplicationContext(), toggleButton.class);
        i.putExtra("Value1", "Android By Javatpoint");
        i.putExtra("Value2", "Simple Tutorial");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);


    }

}
