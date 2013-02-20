package com.rhysyu.soundapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class instrumentslistActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruments);
        
        Button pianobutton = (Button) findViewById(R.id.choosePiano);
        pianobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), pianoActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button guitarbutton = (Button) findViewById(R.id.chooseGuitar);
        guitarbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), guitarActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button drumsbutton = (Button) findViewById(R.id.chooseDrums);
        drumsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), drumsActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button miscbutton = (Button) findViewById(R.id.chooseMisc);
        miscbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), miscActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button cancelbutton = (Button) findViewById(R.id.instrumentscancel);
        cancelbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoundappActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
    
    @Override
    public void onDestroy() {
      super.onDestroy();
    }
    
}