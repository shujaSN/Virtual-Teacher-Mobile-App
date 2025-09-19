package com.arooba.virtualteacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import pl.droidsonroids.gif.AnimationListener;
import pl.droidsonroids.gif.GifDrawable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.widget.VideoView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class learnActivity extends AppCompatActivity implements
        RecognitionListener {
    private VideoView vv;
    private GifImageView mGigImageView;

    ImageView eeye, nnose, llip, hhand, ffeet;
    MediaPlayer mp;
    private static final int REQUEST_RECORD_PERMISSION = 100;
    private TextView returnedText;
    private ToggleButton toggleButton;
    private ProgressBar progressBar;
    private SpeechRecognizer speech = null;
    private Intent recognizerIntent;
    GifImageView gg;
    Button backbtn;
    MediaPlayer ring= new MediaPlayer();
    MediaPlayer ringbtn= new MediaPlayer();
    private String LOG_TAG = "VoiceRecognitionActivity";
    ImageView imageView3;
    GifImageView gifImageView,gifImageView1,gifImageView2,gifImageView3,gifImageView4,gifImageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        Intent intent = new Intent(learnActivity.this, BackgroundSoundService.class);
        stopService(intent);

        gg = (GifImageView) findViewById(R.id.a);
        backbtn = (Button) findViewById(R.id.backbtjkn3);
        eeye = (ImageView) findViewById(R.id.eyetalk);
        nnose = (ImageView) findViewById(R.id.nosetalk);
        llip = (ImageView) findViewById(R.id.liptalk);
        hhand = (ImageView) findViewById(R.id.handtalk);
        ffeet = (ImageView) findViewById(R.id.feettalk);
        // pl.droidsonroids.gif.GifImageView imageView=new pl.droidsonroids.gif.GifImageView(  this );
        //setContentView(imageView);



/*
        gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView1 = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView2 = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView3 = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView4 = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView5 = (GifImageView) findViewById(R.id.GifImageView);

         imageView3=(ImageView)findViewById(R.id.imageView3);
*/


        // gifImageView.setVisibility(View.GONE);
        //MediaPlayer mp=new MediaPlayer();
        backbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                ringbtn.start();
                Intent i = new Intent(getApplicationContext(),mainMenu.class);     // change the activity you want to load
                startActivity(i);

                Intent intent = new Intent(learnActivity.this, BackgroundSoundService.class);
                startService(intent);
                ring.stop();
            }
        });
        eeye.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                ringbtn.start();
                toggleButton.setVisibility(View.INVISIBLE);
                toggleButton.postDelayed(new Runnable() {
                    public void run() {
                        toggleButton.setVisibility(View.VISIBLE);
                    }
                }, 9000);
                eeye.setVisibility(View.INVISIBLE);
                eeye.postDelayed(new Runnable() {
                    public void run() {
                        eeye.setVisibility(View.VISIBLE);
                    }
                }, 9000);
                llip.setVisibility(View.INVISIBLE);
                llip.postDelayed(new Runnable() {
                    public void run() {
                        llip.setVisibility(View.VISIBLE);
                    }
                }, 9000);
                hhand.setVisibility(View.INVISIBLE);
                hhand.postDelayed(new Runnable() {
                    public void run() {
                        hhand.setVisibility(View.VISIBLE);
                    }
                }, 9000);
                nnose.setVisibility(View.INVISIBLE);
                nnose.postDelayed(new Runnable() {
                    public void run() {
                        nnose.setVisibility(View.VISIBLE);
                    }
                }, 9000);
                ffeet.setVisibility(View.INVISIBLE);
                ffeet.postDelayed(new Runnable() {
                    public void run() {
                        ffeet.setVisibility(View.VISIBLE);
                    }
                }, 9000);
                try {

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.eyes);
                    ring.start();
                    final MediaController mc = new MediaController(getApplicationContext());

                    gg.setVisibility(View.VISIBLE);
                    gg.setImageResource(R.drawable.eyes);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                }
                catch ( Exception e)
                {
                    Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
                }
            }
        });
        nnose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                ringbtn.start();
                toggleButton.setVisibility(View.INVISIBLE);
                toggleButton.postDelayed(new Runnable() {
                    public void run() {
                        toggleButton.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                eeye.setVisibility(View.INVISIBLE);
                eeye.postDelayed(new Runnable() {
                    public void run() {
                        eeye.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                llip.setVisibility(View.INVISIBLE);
                llip.postDelayed(new Runnable() {
                    public void run() {
                        llip.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                hhand.setVisibility(View.INVISIBLE);
                hhand.postDelayed(new Runnable() {
                    public void run() {
                        hhand.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                nnose.setVisibility(View.INVISIBLE);
                nnose.postDelayed(new Runnable() {
                    public void run() {
                        nnose.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                ffeet.setVisibility(View.INVISIBLE);
                ffeet.postDelayed(new Runnable() {
                    public void run() {
                        ffeet.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                try {

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.nose);
                    ring.start();
                    final MediaController mc = new MediaController(getApplicationContext());

                    gg.setVisibility(View.VISIBLE);
                    gg.setImageResource(R.drawable.nose);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                }
                catch ( Exception e)
                {
                    Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
                }
            }
        });
        llip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                ringbtn.start();
                toggleButton.setVisibility(View.INVISIBLE);
                toggleButton.postDelayed(new Runnable() {
                    public void run() {
                        toggleButton.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                eeye.setVisibility(View.INVISIBLE);
                eeye.postDelayed(new Runnable() {
                    public void run() {
                        eeye.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                llip.setVisibility(View.INVISIBLE);
                llip.postDelayed(new Runnable() {
                    public void run() {
                        llip.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                hhand.setVisibility(View.INVISIBLE);
                hhand.postDelayed(new Runnable() {
                    public void run() {
                        hhand.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                nnose.setVisibility(View.INVISIBLE);
                nnose.postDelayed(new Runnable() {
                    public void run() {
                        nnose.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                ffeet.setVisibility(View.INVISIBLE);
                ffeet.postDelayed(new Runnable() {
                    public void run() {
                        ffeet.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                try {

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.mouth);
                    ring.start();
                    final MediaController mc = new MediaController(getApplicationContext());

                    gg.setVisibility(View.VISIBLE);
                    gg.setImageResource(R.drawable.mouth);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                }
                catch ( Exception e)
                {
                    Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
                }
            }
        });
        hhand.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                ringbtn.start();
                toggleButton.setVisibility(View.INVISIBLE);
                toggleButton.postDelayed(new Runnable() {
                    public void run() {
                        toggleButton.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                eeye.setVisibility(View.INVISIBLE);
                eeye.postDelayed(new Runnable() {
                    public void run() {
                        eeye.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                llip.setVisibility(View.INVISIBLE);
                llip.postDelayed(new Runnable() {
                    public void run() {
                        llip.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                hhand.setVisibility(View.INVISIBLE);
                hhand.postDelayed(new Runnable() {
                    public void run() {
                        hhand.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                nnose.setVisibility(View.INVISIBLE);
                nnose.postDelayed(new Runnable() {
                    public void run() {
                        nnose.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                ffeet.setVisibility(View.INVISIBLE);
                ffeet.postDelayed(new Runnable() {
                    public void run() {
                        ffeet.setVisibility(View.VISIBLE);
                    }
                }, 7000);
                try {

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.arms);
                    ring.start();
                    final MediaController mc = new MediaController(getApplicationContext());

                    gg.setVisibility(View.VISIBLE);
                    gg.setImageResource(R.drawable.arm);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                }
                catch ( Exception e)
                {
                    Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ffeet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(ringbtn.isPlaying())
                {
                    ringbtn.stop();
                }
                ringbtn.reset();

                ringbtn= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                ringbtn.start();
                toggleButton.setVisibility(View.INVISIBLE);
                toggleButton.postDelayed(new Runnable() {
                    public void run() {
                        toggleButton.setVisibility(View.VISIBLE);
                    }
                }, 8000);
                eeye.setVisibility(View.INVISIBLE);
                eeye.postDelayed(new Runnable() {
                    public void run() {
                        eeye.setVisibility(View.VISIBLE);
                    }
                }, 8000);
                llip.setVisibility(View.INVISIBLE);
                llip.postDelayed(new Runnable() {
                    public void run() {
                        llip.setVisibility(View.VISIBLE);
                    }
                }, 8000);
                hhand.setVisibility(View.INVISIBLE);
                hhand.postDelayed(new Runnable() {
                    public void run() {
                        hhand.setVisibility(View.VISIBLE);
                    }
                }, 8000);
                nnose.setVisibility(View.INVISIBLE);
                nnose.postDelayed(new Runnable() {
                    public void run() {
                        nnose.setVisibility(View.VISIBLE);
                    }
                }, 8000);
                ffeet.setVisibility(View.INVISIBLE);
                ffeet.postDelayed(new Runnable() {
                    public void run() {
                        ffeet.setVisibility(View.VISIBLE);
                    }
                }, 8000);
                try {

                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.legs);
                    ring.start();
                    final MediaController mc = new MediaController(getApplicationContext());

                    gg.setVisibility(View.VISIBLE);
                    gg.setImageResource(R.drawable.legs);
                    mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                    mc.setAnchorView(gg);
                    gg.stopNestedScroll();

                }
                catch ( Exception e)
                {
                    Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
                }
            }
        });
        returnedText = (TextView) findViewById(R.id.textView1);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
        progressBar.setVisibility(View.INVISIBLE);
        speech = SpeechRecognizer.createSpeechRecognizer(this);
        Log.i(LOG_TAG, "isRecognitionAvailable: " + SpeechRecognizer.isRecognitionAvailable(this));
        speech.setRecognitionListener(this);
        recognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE,
                "en");
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 3);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                    ring.start();
                    progressBar.setVisibility(View.VISIBLE);
                    progressBar.setIndeterminate(true);
                    ActivityCompat.requestPermissions
                            (learnActivity.this,
                                    new String[]{Manifest.permission.RECORD_AUDIO},
                                    REQUEST_RECORD_PERMISSION);
                } else {
                    if(ring.isPlaying())
                    {
                        ring.stop();
                    }
                    ring.reset();

                    ring= MediaPlayer.create(learnActivity.this,R.raw.btnclick);
                    ring.start();
                    progressBar.setIndeterminate(false);
                    progressBar.setVisibility(View.INVISIBLE);
                    speech.stopListening();
                }
            }
        });
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_RECORD_PERMISSION:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    speech.startListening(recognizerIntent);
                } else {
                    Toast.makeText(learnActivity.this, "Permission Denied!", Toast
                            .LENGTH_SHORT).show();
                }
        }
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
        if (speech != null) {
            speech.destroy();
            Log.i(LOG_TAG, "destroy");
        }
    }
    @Override
    public void onBeginningOfSpeech() {
        Log.i(LOG_TAG, "onBeginningOfSpeech");
        progressBar.setIndeterminate(false);
        progressBar.setMax(10);
    }
    @Override
    public void onBufferReceived(byte[] buffer) {
        Log.i(LOG_TAG, "onBufferReceived: " + buffer);
    }
    @Override
    public void onEndOfSpeech() {
        Log.i(LOG_TAG, "onEndOfSpeech");
        progressBar.setIndeterminate(true);
        toggleButton.setChecked(false);
    }
    @Override
    public void onError(int errorCode) {
        String errorMessage = getErrorText(errorCode);
        Log.d(LOG_TAG, "FAILED " + errorMessage);
        returnedText.setText(errorMessage);
        toggleButton.setChecked(false);
    }


    @Override
    public void onEvent(int arg0, Bundle arg1) {
        Log.i(LOG_TAG, "onEvent");
    }
    @Override
    public void onPartialResults(Bundle arg0) {
        Log.i(LOG_TAG, "onPartialResults");
    }
    @Override
    public void onReadyForSpeech(Bundle arg0) {
        Log.i(LOG_TAG, "onReadyForSpeech");
    }
    @Override
    public void onResults(Bundle results) {
        Log.i(LOG_TAG, "onResults");
        ArrayList<String> matches = results
                .getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
        String text = "";
        for (String result : matches){
            text += result + "\n";}
        returnedText.setText(text);
        if (matches.contains("are you ready")) {
            toggleButton.setVisibility(View.INVISIBLE);
            toggleButton.postDelayed(new Runnable() {
                public void run() {
                    toggleButton.setVisibility(View.VISIBLE);
                }
            }, 5000);
            eeye.setVisibility(View.INVISIBLE);
            eeye.postDelayed(new Runnable() {
                public void run() {
                    eeye.setVisibility(View.VISIBLE);
                }
            }, 5000);
            llip.setVisibility(View.INVISIBLE);
            llip.postDelayed(new Runnable() {
                public void run() {
                    llip.setVisibility(View.VISIBLE);
                }
            }, 5000);
            hhand.setVisibility(View.INVISIBLE);
            hhand.postDelayed(new Runnable() {
                public void run() {
                    hhand.setVisibility(View.VISIBLE);
                }
            }, 5000);
            nnose.setVisibility(View.INVISIBLE);
            nnose.postDelayed(new Runnable() {
                public void run() {
                    nnose.setVisibility(View.VISIBLE);
                }
            }, 5000);
            ffeet.setVisibility(View.INVISIBLE);
            ffeet.postDelayed(new Runnable() {
                public void run() {
                    ffeet.setVisibility(View.VISIBLE);
                }
            }, 5000);
            try {
                MediaPlayer ring = new MediaPlayer();

                if (ring.isPlaying()) {
                    ring.stop();
                }
                ring.reset();

                ring = MediaPlayer.create(learnActivity.this, R.raw.areyoureadyaudio);
                ring.start();

                final MediaController mc = new MediaController(getApplicationContext());

                gg.setVisibility(View.VISIBLE);
                gg.setImageResource(R.drawable.areyouready);
                mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                mc.setAnchorView(gg);
                gg.stopNestedScroll();



            }
            catch ( Exception e)
            {
                Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
            }
        }
        else if (matches.contains("touch your eye") || matches.contains("touch your eyes") ) {

            toggleButton.setVisibility(View.INVISIBLE);
            toggleButton.postDelayed(new Runnable() {
                public void run() {
                    toggleButton.setVisibility(View.VISIBLE);
                }
            }, 9000);
            eeye.setVisibility(View.INVISIBLE);
            eeye.postDelayed(new Runnable() {
                public void run() {
                    eeye.setVisibility(View.VISIBLE);
                }
            }, 9000);
            llip.setVisibility(View.INVISIBLE);
            llip.postDelayed(new Runnable() {
                public void run() {
                    llip.setVisibility(View.VISIBLE);
                }
            }, 9000);
            hhand.setVisibility(View.INVISIBLE);
            hhand.postDelayed(new Runnable() {
                public void run() {
                    hhand.setVisibility(View.VISIBLE);
                }
            }, 9000);
            nnose.setVisibility(View.INVISIBLE);
            nnose.postDelayed(new Runnable() {
                public void run() {
                    nnose.setVisibility(View.VISIBLE);
                }
            }, 9000);
            ffeet.setVisibility(View.INVISIBLE);
            ffeet.postDelayed(new Runnable() {
                public void run() {
                    ffeet.setVisibility(View.VISIBLE);
                }
            }, 9000);
            try {
                MediaPlayer ring= new MediaPlayer();

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(learnActivity.this,R.raw.eyes);
                ring.start();
                final MediaController mc = new MediaController(getApplicationContext());

                gg.setVisibility(View.VISIBLE);
                gg.setImageResource(R.drawable.eyes);
                mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                mc.setAnchorView(gg);
                gg.stopNestedScroll();

            }
            catch ( Exception e)
            {
                Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
            }
        }
        else if (matches.contains("touch your nose")) {
            toggleButton.setVisibility(View.INVISIBLE);
            toggleButton.postDelayed(new Runnable() {
                public void run() {
                    toggleButton.setVisibility(View.VISIBLE);
                }
            }, 7000);
            eeye.setVisibility(View.INVISIBLE);
            eeye.postDelayed(new Runnable() {
                public void run() {
                    eeye.setVisibility(View.VISIBLE);
                }
            }, 7000);
            llip.setVisibility(View.INVISIBLE);
            llip.postDelayed(new Runnable() {
                public void run() {
                    llip.setVisibility(View.VISIBLE);
                }
            }, 7000);
            hhand.setVisibility(View.INVISIBLE);
            hhand.postDelayed(new Runnable() {
                public void run() {
                    hhand.setVisibility(View.VISIBLE);
                }
            }, 7000);
            nnose.setVisibility(View.INVISIBLE);
            nnose.postDelayed(new Runnable() {
                public void run() {
                    nnose.setVisibility(View.VISIBLE);
                }
            }, 7000);
            ffeet.setVisibility(View.INVISIBLE);
            ffeet.postDelayed(new Runnable() {
                public void run() {
                    ffeet.setVisibility(View.VISIBLE);
                }
            }, 7000);
            try {
                MediaPlayer ring= new MediaPlayer();

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(learnActivity.this,R.raw.nose);
                ring.start();
                final MediaController mc = new MediaController(getApplicationContext());

                gg.setVisibility(View.VISIBLE);
                gg.setImageResource(R.drawable.nose);
                mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                mc.setAnchorView(gg);
                gg.stopNestedScroll();

            }
            catch ( Exception e)
            {
                Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
            }
        }
        else if (matches.contains("open your mouth")) {
            toggleButton.setVisibility(View.INVISIBLE);
            toggleButton.postDelayed(new Runnable() {
                public void run() {
                    toggleButton.setVisibility(View.VISIBLE);
                }
            }, 7000);
            eeye.setVisibility(View.INVISIBLE);
            eeye.postDelayed(new Runnable() {
                public void run() {
                    eeye.setVisibility(View.VISIBLE);
                }
            }, 7000);
            llip.setVisibility(View.INVISIBLE);
            llip.postDelayed(new Runnable() {
                public void run() {
                    llip.setVisibility(View.VISIBLE);
                }
            }, 7000);
            hhand.setVisibility(View.INVISIBLE);
            hhand.postDelayed(new Runnable() {
                public void run() {
                    hhand.setVisibility(View.VISIBLE);
                }
            }, 7000);
            nnose.setVisibility(View.INVISIBLE);
            nnose.postDelayed(new Runnable() {
                public void run() {
                    nnose.setVisibility(View.VISIBLE);
                }
            }, 7000);
            ffeet.setVisibility(View.INVISIBLE);
            ffeet.postDelayed(new Runnable() {
                public void run() {
                    ffeet.setVisibility(View.VISIBLE);
                }
            }, 7000);
            try {
                MediaPlayer ring= new MediaPlayer();

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(learnActivity.this,R.raw.mouth);
                ring.start();
                final MediaController mc = new MediaController(getApplicationContext());

                gg.setVisibility(View.VISIBLE);
                gg.setImageResource(R.drawable.mouth);
                mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                mc.setAnchorView(gg);
                gg.stopNestedScroll();

            }
            catch ( Exception e)
            {
                Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
            }
        }
        else if (matches.contains("move your legs") || matches.contains("move your leg")) {
            toggleButton.setVisibility(View.INVISIBLE);
            toggleButton.postDelayed(new Runnable() {
                public void run() {
                    toggleButton.setVisibility(View.VISIBLE);
                }
            }, 8000);
            eeye.setVisibility(View.INVISIBLE);
            eeye.postDelayed(new Runnable() {
                public void run() {
                    eeye.setVisibility(View.VISIBLE);
                }
            }, 8000);
            llip.setVisibility(View.INVISIBLE);
            llip.postDelayed(new Runnable() {
                public void run() {
                    llip.setVisibility(View.VISIBLE);
                }
            }, 8000);
            hhand.setVisibility(View.INVISIBLE);
            hhand.postDelayed(new Runnable() {
                public void run() {
                    hhand.setVisibility(View.VISIBLE);
                }
            }, 8000);
            nnose.setVisibility(View.INVISIBLE);
            nnose.postDelayed(new Runnable() {
                public void run() {
                    nnose.setVisibility(View.VISIBLE);
                }
            }, 8000);
            ffeet.setVisibility(View.INVISIBLE);
            ffeet.postDelayed(new Runnable() {
                public void run() {
                    ffeet.setVisibility(View.VISIBLE);
                }
            }, 8000);
            try {
                MediaPlayer ring= new MediaPlayer();

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(learnActivity.this,R.raw.legs);
                ring.start();
                final MediaController mc = new MediaController(getApplicationContext());

                gg.setVisibility(View.VISIBLE);
                gg.setImageResource(R.drawable.legs);
                mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                mc.setAnchorView(gg);
                gg.stopNestedScroll();

            }
            catch ( Exception e)
            {
                Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
            }
        }
        else if (matches.contains("move your arms") || matches.contains("move your arm")) {
            toggleButton.setVisibility(View.INVISIBLE);
            toggleButton.postDelayed(new Runnable() {
                public void run() {
                    toggleButton.setVisibility(View.VISIBLE);
                }
            }, 7000);
            eeye.setVisibility(View.INVISIBLE);
            eeye.postDelayed(new Runnable() {
                public void run() {
                    eeye.setVisibility(View.VISIBLE);
                }
            }, 7000);
            llip.setVisibility(View.INVISIBLE);
            llip.postDelayed(new Runnable() {
                public void run() {
                    llip.setVisibility(View.VISIBLE);
                }
            }, 7000);
            hhand.setVisibility(View.INVISIBLE);
            hhand.postDelayed(new Runnable() {
                public void run() {
                    hhand.setVisibility(View.VISIBLE);
                }
            }, 7000);
            nnose.setVisibility(View.INVISIBLE);
            nnose.postDelayed(new Runnable() {
                public void run() {
                    nnose.setVisibility(View.VISIBLE);
                }
            }, 7000);
            ffeet.setVisibility(View.INVISIBLE);
            ffeet.postDelayed(new Runnable() {
                public void run() {
                    ffeet.setVisibility(View.VISIBLE);
                }
            }, 7000);
            try {
                MediaPlayer ring= new MediaPlayer();

                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(learnActivity.this,R.raw.arms);
                ring.start();
                final MediaController mc = new MediaController(getApplicationContext());

                gg.setVisibility(View.VISIBLE);
                gg.setImageResource(R.drawable.arm);
                mc.setMediaPlayer((GifDrawable) gg.getDrawable());
                mc.setAnchorView(gg);
                gg.stopNestedScroll();

            }
            catch ( Exception e)
            {
                Toast.makeText(learnActivity.this, "Please try again later", Toast.LENGTH_SHORT).show();
            }
        }

    }
    @Override
    public void onRmsChanged(float rmsdB) {
        Log.i(LOG_TAG, "onRmsChanged: " + rmsdB);
        progressBar.setProgress((int) rmsdB);
    }
    public static String getErrorText(int errorCode) {
        String message;
        switch (errorCode) {
            case SpeechRecognizer.ERROR_AUDIO:
                message = "Audio recording error";
                break;
            case SpeechRecognizer.ERROR_CLIENT:
                message = "Client side error";
                break;
            case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
                message = "Insufficient permissions";
                break;
            case SpeechRecognizer.ERROR_NETWORK:
                message = "Network error";
                break;
            case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
                message = "Network timeout";
                break;
            case SpeechRecognizer.ERROR_NO_MATCH:
                message = "No match";
                break;
            case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
                message = "RecognitionService busy";
                break;
            case SpeechRecognizer.ERROR_SERVER:
                message = "error from server";
                break;
            case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
                message = "No speech input";
                break;
            default:
                message = "Didn't understand, please try again.";
                break;
        }
        return message;
    }
}