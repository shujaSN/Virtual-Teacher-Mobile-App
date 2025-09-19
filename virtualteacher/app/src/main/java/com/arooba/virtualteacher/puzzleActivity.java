package com.arooba.virtualteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class puzzleActivity extends AppCompatActivity {
    ImageView btn ,btn2,btn3;
    Button backtbn;
    MediaPlayer ring= new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_puzzle);
        getSupportActionBar().hide();


        Intent intent = new Intent(puzzleActivity.this, BackgroundSoundService.class);
        startService(intent);

        backtbn = (Button) findViewById(R.id.backbtn);
        backtbn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(puzzleActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),mainMenu.class);     // change the activity you want to load
                startActivity(i);

            }
        });
        btn = (ImageView) findViewById(R.id.imageView3);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(puzzleActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),leveltwoActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        btn2 = (ImageView) findViewById(R.id.imageView4);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(puzzleActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelthreeActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        btn3 = (ImageView) findViewById(R.id.imageView6);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(puzzleActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelfourActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
    }
}
