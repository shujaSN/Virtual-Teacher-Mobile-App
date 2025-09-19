package com.arooba.virtualteacher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class playActivity extends AppCompatActivity {
    MediaPlayer ring= new MediaPlayer();
    Button btn;
    private static final int My_PERMISSION_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_play);
        getSupportActionBar().hide();
        btn = (Button) findViewById(R.id.button);
        try {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.RECORD_AUDIO)) {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, My_PERMISSION_REQUEST);

                } else {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, My_PERMISSION_REQUEST);

                }
            }
        } catch (Exception e) {
            Toast.makeText(playActivity.this, ""+ e ,Toast.LENGTH_SHORT).show();
        }

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ring.isPlaying())
                {
                    ring.stop();
                }
                ring.reset();

                ring= MediaPlayer.create(playActivity.this,R.raw.btnclick);
                ring.start();
                Intent i = new Intent(getApplicationContext(),mainMenu.class);     // change the activity you want to load
                startActivity(i);
                finish();
            }
        });


    }


}