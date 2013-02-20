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

public class guitarActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guitartone);
        
        Button cancelbutton = (Button) findViewById(R.id.guitarcancel);
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