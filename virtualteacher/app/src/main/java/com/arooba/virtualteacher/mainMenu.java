package com.arooba.virtualteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
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


public class mainMenu extends AppCompatActivity {
    MediaPlayer ring = new MediaPlayer();
    ImageView btn,btn2,btn3;
    Button helpp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().hide();

        helpp = (Button) findViewById(R.id.helpbttn);
        helpp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(mainMenu.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),aboutActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        btn = (ImageView) findViewById(R.id.imageView4);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(mainMenu.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(), puzzleActivity.class);     // change the activity you want to load
                startActivity(i);

            }
        });
        btn2 = (ImageView) findViewById(R.id.imageView3);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(mainMenu.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);     // change the activity you want to load
                startActivity(i);

            }
        });
        btn2 = (ImageView) findViewById(R.id.imageView6);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(mainMenu.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),learnActivity.class);     // change the activity you want to load
                startActivity(i);

            }
        });

    }
}