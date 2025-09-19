package com.arooba.virtualteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class aboutActivity extends AppCompatActivity {
    MediaPlayer ring = new MediaPlayer();
    Button backk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        backk = (Button) findViewById(R.id.button2);
        backk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(aboutActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),mainMenu.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
    }
}