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

public class SoundappActivity extends Activity {
	
	// add instrument here
	final CharSequence[] instrumentlist={"Piano","Guitar","Drums","Misc."};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button playmusicbutton = (Button) findViewById(R.id.playmusic);
        playmusicbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                Intent myIntent = new Intent(view.getContext(), SoundappActivity.class);
//                startActivityForResult(myIntent, 0);
                MediaPlayer mp1 = MediaPlayer.create(SoundappActivity.this, R.raw.payphone_long);
            	mp1.start();
            }

        });
        
        Button instrumentslistbutton = (Button) findViewById(R.id.instrumentlist);
        instrumentslistbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), instrumentslistActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        
    }
    
    @Override
    public void onDestroy() {
      super.onDestroy();
    }
    
    public void about_Click(View v){
    	showAbout();
    }
    
    public void exit_Click(View v){
    	this.finish();
    }
    
    private void showAbout(){
    	final Dialog d = new Dialog(this);
    	d.setContentView(R.layout.aboutdialog);	
    	d.setTitle("About this App");
    	//set up button
        Button closebutton = (Button) d.findViewById(R.id.closeaboutdialog);
        closebutton.setOnClickListener(new OnClickListener() {
        @Override
            public void onClick(View v) {
        		d.dismiss();
            }
        });
        d.show();
    }
}