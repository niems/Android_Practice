package com.example.niems.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent(); //receives the intent from the calling activity
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); //extract the message from the intent

        message = checkMessage( message );

        TextView text_view = new TextView(this);
        text_view.setTextSize(50);
        text_view.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content); //chooses to display this xml file
        layout.addView(text_view); //changes to the new activity view
    }

    public String checkMessage(String message){
        switch(message){

            case "fuck you":
                message = "no. fuck you!";
                break;

            case "hey":
                message = "hello.";
                break;

            default:
                message = "please stop messaging me.";
        }

        return message;
    }
}
