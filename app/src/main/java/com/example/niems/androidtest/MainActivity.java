package com.example.niems.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.niems.androidtest.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitleColor(Color.BLUE);
    }

    public void onPause(){
        super.onPause();

        //other stuff to do while paused
    }

    public void onResume(){
        super.onResume();

        //other stuff to do while resuming
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class); //creates the intent to start the new activity
        EditText edit_text = (EditText) findViewById(R.id.edit_message);
        String message = edit_text.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



}
