package com.arooba.virtualteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

public class leveltwoActivity extends AppCompatActivity {
    MediaPlayer ringMain= new MediaPlayer();
    MediaPlayer ring= new MediaPlayer();
    MediaPlayer ring2= new MediaPlayer();
    RelativeLayout completel,blur;
    Intent intent;
    Button ship,apple,poop,levellist,levellist2,play1,play2,replay1,replay2,replay3,backbtn;
    boolean condition1=false,condition2=false,condition3=false;
    GifImageView gg;
    ImageView completeMenu,tick1,tick2,tick3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_leveltwo);
        getSupportActionBar().hide();

        intent = new Intent(leveltwoActivity.this, BackgroundSoundService.class);
        stopService(intent);

        levellist = (Button) findViewById(R.id.levellist);
        levellist2 = (Button) findViewById(R.id.levellist2);
        play1 = (Button) findViewById(R.id.play1);
        play2 = (Button) findViewById(R.id.play2);
        replay1 = (Button) findViewById(R.id.replay1);
        replay2 = (Button) findViewById(R.id.replay2);
        replay3 = (Button) findViewById(R.id.replay3);
        completel = (RelativeLayout) findViewById(R.id.completel);


        gg = (GifImageView) findViewById(R.id.a);
        ship = (Button) findViewById(R.id.shipbtn);
        apple = (Button) findViewById(R.id.applebtn);
        poop = (Button) findViewById(R.id.popbtn);
        backbtn = (Button) findViewById(R.id.backbtn2);
        blur = (RelativeLayout) findViewById(R.id.blur);
        tick1 = (ImageView) findViewById(R.id.shiptick);
        tick2 = (ImageView) findViewById(R.id.poptick);
        tick3 = (ImageView) findViewById(R.id.appletick);
        //completeMenu = (ImageView) findViewById(R.id.completeMenu);

        if(ringMain.isPlaying())
        {
            ringMain.stop();
        }
        ringMain.reset();

        ringMain= MediaPlayer.create(leveltwoActivity.this,R.raw.puzzle2);
        ringMain.start();
        levellist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
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

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
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

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelthreeActivity.class);     // change the activity you want to load
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

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelthreeActivity.class);     // change the activity you want to load
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

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),leveltwoActivity.class);     // change the activity you want to load
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

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),leveltwoActivity.class);     // change the activity you want to load
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

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),leveltwoActivity.class);     // change the activity you want to load
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

                ring2= MediaPlayer.create(leveltwoActivity.this,R.raw.btnclick);
                ring2.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();

                Intent intent = new Intent(leveltwoActivity.this, BackgroundSoundService.class);
                startService(intent);
                ring.stop();
                ringMain.stop();
                       }
        });
        ship.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition1 = true;
                tick1.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 )
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(leveltwoActivity.this,R.raw.win);
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
        poop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition2 = true;
                tick2.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 )
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(leveltwoActivity.this,R.raw.win);
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
        apple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(leveltwoActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition3= true;
                tick3.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 )
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(leveltwoActivity.this,R.raw.win);
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