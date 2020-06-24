package com.example.test;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DrumtestActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_MainActivity = 1004;
    SoundPool pool;
    int d1,d2,d3,d4,d5,d6,d7,d8,d9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen);
        setContentView(R.layout.activity_drumtest);

        // res-raw 폴더 안에 drum1~8 소리를 넣어줘야 이것들이 작동을 한다...
        pool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        d1 = pool.load(this, R.raw.snare, 1);
        d2 = pool.load(this, R.raw.highhat, 1);
        d3 = pool.load(this, R.raw.crash, 1);
        d4 = pool.load(this, R.raw.ride, 1);
        d5 = pool.load(this, R.raw.smalltom, 1);
        d6 = pool.load(this, R.raw.largetom, 1);
        d7 = pool.load(this, R.raw.floortom, 1);
        d8 = pool.load(this, R.raw.basedrum, 1);


        Button bt1 = (Button) findViewById(R.id.d1);
        Button bt2 = (Button) findViewById(R.id.d2);
        Button bt3 = (Button) findViewById(R.id.d3);
        Button bt4 = (Button) findViewById(R.id.d4);
        Button bt5 = (Button) findViewById(R.id.d5);
        Button bt6 = (Button) findViewById(R.id.d6);
        Button bt7 = (Button) findViewById(R.id.d7);
        Button bt8 = (Button) findViewById(R.id.d8);


        bt1.setOnClickListener(mClickLisner);
        bt2.setOnClickListener(mClickLisner);
        bt3.setOnClickListener(mClickLisner);
        bt4.setOnClickListener(mClickLisner);
        bt5.setOnClickListener(mClickLisner);
        bt6.setOnClickListener(mClickLisner);
        bt7.setOnClickListener(mClickLisner);
        bt8.setOnClickListener(mClickLisner);

    }
    public void Clickdrumback(View v){
        Intent resultIntent = new Intent();
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    Button.OnClickListener mClickLisner = new Button.OnClickListener(){
        public void onClick(View v){

            switch(v.getId()) {
                case R.id.d1:
                    pool.play(d1, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d2:
                    pool.play(d2, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d3:
                    pool.play(d3, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d4:
                    pool.play(d4, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d5:
                    pool.play(d5, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d6:
                    pool.play(d6, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d7:
                    pool.play(d7, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;
                case R.id.d8:
                    pool.play(d8, 1.0F, 1.0F, 0, 0, 1.0F);
                    break;

            }
        }
    };
}