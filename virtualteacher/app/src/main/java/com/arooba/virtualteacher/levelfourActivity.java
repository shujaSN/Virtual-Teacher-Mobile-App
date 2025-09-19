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

public class levelfourActivity extends AppCompatActivity {
    RelativeLayout completel,blur;
    MediaPlayer ring= new MediaPlayer();
    MediaPlayer ringbtn= new MediaPlayer();
    MediaPlayer ringMain= new MediaPlayer();
    MediaPlayer ring2= new MediaPlayer();

    Button doll1,doll2,bird,applebttn,applebttn2,alphabetKKK,pencil,alphabet,levellist,levellist2,play1,play2,replay1,replay2,replay3,backbtn;
    boolean condition1=false,condition2=false,condition3=false,condition4=false,condition5=false, condition6 =false;
    pl.droidsonroids.gif.GifImageView gg;
    ImageView completeMenu,dolltick,birdtick,alphabettick,alphabetKKKtick,penciltick,latutick,yellowcartoontick,appleticki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_levelfour);
        getSupportActionBar().hide();


        Intent intent = new Intent(levelfourActivity.this, BackgroundSoundService.class);
        stopService(intent);

        levellist = (Button) findViewById(R.id.levellist);
        levellist2 = (Button) findViewById(R.id.levellist2);
        play1 = (Button) findViewById(R.id.play1);
        play2 = (Button) findViewById(R.id.play2);
        replay1 = (Button) findViewById(R.id.replay1);
        replay2 = (Button) findViewById(R.id.replay2);
        backbtn = (Button) findViewById(R.id.backbtn3);
        replay3 = (Button) findViewById(R.id.replay3);
        completel = (RelativeLayout) findViewById(R.id.completel);


        gg = (GifImageView) findViewById(R.id.a2);


        doll1 = (Button) findViewById(R.id.doll1);
        doll2 = (Button) findViewById(R.id.doll2);
        bird = (Button) findViewById(R.id.bird);
        applebttn = (Button) findViewById(R.id.applebttn);
        applebttn2 = (Button) findViewById(R.id.applebttn2);
        alphabetKKK = (Button) findViewById(R.id.alphabetKKK);
        pencil = (Button) findViewById(R.id.pencil);
        alphabet = (Button) findViewById(R.id.alphabet);


        blur = (RelativeLayout) findViewById(R.id.blur);


        dolltick = (ImageView) findViewById(R.id.dolltick);
        birdtick = (ImageView) findViewById(R.id.birdtick);
        alphabettick = (ImageView) findViewById(R.id.alphabettick);
        alphabetKKKtick = (ImageView) findViewById(R.id.alphabetKKKtick);
        penciltick = (ImageView) findViewById(R.id.penciltick);
        appleticki = (ImageView) findViewById(R.id.appleticki2);

        if(ringMain.isPlaying())
        {
            ringMain.stop();
        }
        ringMain.reset();

        ringMain= MediaPlayer.create(levelfourActivity.this,R.raw.puzzle2);
        ringMain.start();
        //completeMenu = (ImageView) findViewById(R.id.completeMenu);

        levellist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        levellist2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        play1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        replay1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),levelfourActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });
        replay2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),levelfourActivity.class);     // change the activity you want to load
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

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),levelfourActivity.class);     // change the activity you want to load
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

                ring2= MediaPlayer.create(levelfourActivity.this,R.raw.btnclick);
                ring2.start();
                Intent i = new Intent(getApplicationContext(),puzzleActivity.class);     // change the activity you want to load
                startActivity(i);
                finish();

                Intent intent = new Intent(levelfourActivity.this, BackgroundSoundService.class);
                startService(intent);
                ring.stop();
                ringMain.stop();
            }
        });
        doll1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew);
                ring.start();
                condition1 = true;
                dolltick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {
                    ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        doll2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition1 = true;
                dolltick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        bird.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition2 = true;
                birdtick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        pencil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition3= true;
                penciltick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();


                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        applebttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition4= true;
                appleticki.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        applebttn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition4= true;
                appleticki.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        alphabet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition5= true;
                alphabettick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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
        alphabetKKK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(levelfourActivity.this,R.raw.btnmusicnew2);
                ring.start();
                condition6= true;
                alphabetKKKtick.setVisibility(View.VISIBLE);
                if (condition1 && condition2 && condition3 && condition4 && condition5 && condition6)
                {ringMain.stop();

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(levelfourActivity.this,R.raw.win);
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