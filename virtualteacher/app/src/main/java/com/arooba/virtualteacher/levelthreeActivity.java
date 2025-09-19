package com.arooba.virtualteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class levelthreeActivity extends AppCompatActivity {
    MediaPlayer ringMain= new MediaPlayer();
    MediaPlayer ring= new MediaPlayer();
    MediaPlayer ring2= new MediaPlayer();
    RelativeLayout completel,blur;
    Button latu,fan,helicopterbtn,latu2,yellowcartton,alphabetKKK,pencil,alphabet,levellist,levellist2,play1,play2,replay1,replay2,replay3,backbtn;
    boolean condition1=false,condition2=false,condition3=false,condition4=false;
    pl.droidsonroids.gif.GifImageView gg;
    ImageView completeMenu,fantick,halicoptertick,alphabettick,alphabetKKKtick,penciltick,latutick,yellowcartoontick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_levelthree);
        getSupportActionBar().hide();


        Intent intent = new Intent(levelthreeActivity.this, BackgroundSoundService.class);
        stopService(intent);

        levellist = (Button) findViewById(R.id.levellist);
        levellist2 = (Button) findViewById(R.id.levellist2);
        play1 = (Button) findViewById(R.id.play1);
        play2 = (Button) findViewById(R.id.play2);
        replay1 = (Button) findViewById(R.id.replay1);
        replay2 = (Button) findViewById(R.id.replay2);
        backbtn = (Button) findViewById(R.id.backbtn);
        replay3 = (Button) findViewById(R.id.replay3);
        completel = (RelativeLayout) findViewById(R.id.completel);


        gg = (GifImageView) findViewById(R.id.a);

        fan = (Button) findViewById(R.id.fan);
        helicopterbtn = (Button) findViewById(R.id.halicopter);
        latu = (Button) findViewById(R.id.latu);
        latu2 = (Button) findViewById(R.id.latu2);
        yellowcartton = (Button) findViewById(R.id.yellowcartton);


        blur = (RelativeLayout) findViewById(R.id.blur);
        latutick = (ImageView) findViewById(R.id.latutick);
        fantick = (ImageView) findViewById(R.id.fantick);
        halicoptertick = (ImageView) findViewById(R.id.halicoptertick);
        yellowcartoontick = (ImageView) findViewById(R.id.yellowcarttontick);
        //completeMenu = (ImageView) findViewById(R.id.completeMenu);

        if(ringMain.isPlaying())
        {
            ringMain.stop();
        }
        ringMain.reset();

        ringMain= MediaPlayer.create(levelthreeActivity.this,R.raw.puzzle2);
        ringMain.start();
        levellist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        levellist2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        play1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelfourActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelfourActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        replay1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelthreeActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        replay2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelthreeActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        replay3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelthreeActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring2.isPlaying())
                {
                    ring2.stop();
                }
                ring2.reset();

                ring2= MediaPlayer.create(levelthreeActivity.this,R.raw.btnclick);
                ring2.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();

                Intent intent = new Intent(levelthreeActivity.this, BackgroundSoundService.class);
                startService(intent);
                ring.stop();
                ringMain.stop();
            }
        });
        latu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition1 = true;
                latutick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4)
                {ringMain.stop();


                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelthreeActivity.this,R.raw.win);
                    ring.start();
                    blur.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.VISIBLE);
                    final MediaController mc = new MediaController(getApplicationContext());
                    gg.setImageResource(R.drawable.completedance);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                    completel.postDelayed(new Runnable() {
                        public void run() {
                            completel.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                }
            }
        });
        latu2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition1 = true;
                latutick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelthreeActivity.this,R.raw.win);
                    ring.start();
                    blur.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.VISIBLE);
                    final MediaController mc = new MediaController(getApplicationContext());
                    gg.setImageResource(R.drawable.completedance);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                    completel.postDelayed(new Runnable() {
                        public void run() {
                            completel.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                }
            }
        });
        helicopterbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition2 = true;
                halicoptertick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelthreeActivity.this,R.raw.win);
                    ring.start();
                    blur.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.VISIBLE);
                    final MediaController mc = new MediaController(getApplicationContext());
                    gg.setImageResource(R.drawable.completedance);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                    completel.postDelayed(new Runnable() {
                        public void run() {
                            completel.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                }
            }
        });
        fan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition3= true;
                fantick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelthreeActivity.this,R.raw.win);
                    ring.start();
                    blur.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.VISIBLE);
                    final MediaController mc = new MediaController(getApplicationContext());
                    gg.setImageResource(R.drawable.completedance);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                    completel.postDelayed(new Runnable() {
                        public void run() {
                            completel.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                }
            }
        });
        yellowcartton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelthreeActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition4= true;
                yellowcartoontick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4)
                {

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelthreeActivity.this,R.raw.win);
                    ring.start();
                    blur.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.VISIBLE);
                    final MediaController mc = new MediaController(getApplicationContext());
                    gg.setImageResource(R.drawable.completedance);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                    completel.postDelayed(new Runnable() {
                        public void run() {
                            completel.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                }
            }
        });
    }

}