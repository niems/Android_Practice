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

        Intent intent = getIntent(); //retrieves the intent from the calling activity
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); //pulls the message from the intent

        message = checkMessage( message );

        //creates a view and adds the message from the intent to it
        TextView text_view = new TextView(this);
        text_view.setTextSize(50);
        text_view.setText(message);

        //adds the text view to the layout
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(text_view);
    }

    public void onPause(){
        super.onPause();

        //other stuff to do while paused
    }

    public void onResume(){
        super.onResume();

        //other stuff to do while resuming
    }

    public String checkMessage(String message){

        switch(message){
            case "hey":
                message = "hello.";
                break;

            case "fuck you":
                message = "no. fuck you!";
                break;

            default:
                message = "Please stop messaging me.";
        }

        return message;
    }
}
