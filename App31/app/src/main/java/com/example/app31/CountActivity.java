package com.example.app31;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CountActivity extends AppCompatActivity {
    ImageView zero, one, two, three, four, five, six, seven, eight, nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_count);

        zero = findViewById(R.id.img0);
        one = findViewById(R.id.img1);
        two = findViewById(R.id.img2);
        three = findViewById(R.id.img3);
        four = findViewById(R.id.img4);
        five = findViewById(R.id.img5);
        six = findViewById(R.id.img6);
        seven = findViewById(R.id.img7);
        eight = findViewById(R.id.img8);
        nine = findViewById(R.id.img9);

        MediaPlayer azero= MediaPlayer.create(this, R.raw.chat);
        MediaPlayer aone= MediaPlayer.create(this, R.raw.a1);
        MediaPlayer atwo= MediaPlayer.create(this, R.raw.a2);
        MediaPlayer athree= MediaPlayer.create(this, R.raw.a3);
        MediaPlayer afour= MediaPlayer.create(this, R.raw.a4);
        MediaPlayer afive= MediaPlayer.create(this, R.raw.a5);
        MediaPlayer asix= MediaPlayer.create(this, R.raw.a6);
        MediaPlayer aseven= MediaPlayer.create(this, R.raw.a7);
        MediaPlayer aeight= MediaPlayer.create(this, R.raw.a8);
        MediaPlayer anine= MediaPlayer.create(this, R.raw.a9);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azero.start();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aone.start();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atwo.start();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                athree.start();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afour.start();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afive.start();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asix.start();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aseven.start();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aeight.start();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anine.start();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}