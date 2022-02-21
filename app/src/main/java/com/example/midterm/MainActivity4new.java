package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4new extends AppCompatActivity {
    TextView textView = (TextView) findViewById(R.id.tv);
    MainActivity4 activity4 = new MainActivity4();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4new);

        MediaPlayer mediaPlayer1 = new MediaPlayer();
        mediaPlayer1 = MediaPlayer.create(this, R.raw.track1);
        mediaPlayer1.start();

        textView.setText("Magnificent Mile");

    }
}