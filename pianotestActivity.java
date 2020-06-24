package com.example.test;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;


public class pianotestActivity extends AppCompatActivity {

    SoundPool pool;

    int snare, highhat, crash, ride, smalltom, largetom, floortom, basedrum;

    private float x, y;

    ImageButton snareBtn1, highhatBtn1, crashBtn1, rideBtn1, smalltomBtn1, largetomBtn1, floortomBtn1, basedrumBtn1;


    private HorizontalScrollView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_pianotest);

        getXmlId();
        loadMusic();
    }

    public void controlScroll(View view) {
        View.OnTouchListener touchListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final int action = motionEvent.getAction();
                switch (action & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN :
                        // 처음 터치가 눌러졌을 때
                        // TodoList : 해당 건반만 소리 나게 설정

                        break;
                    case MotionEvent.ACTION_MOVE:
                        // 터치가 눌린 상태에서 움직일 때
                        // "도레미파솔라시도"처럼 음 소리나게
                        // 스크롤뷰 움직이지 못하게 막기

                        break;
                    case MotionEvent.ACTION_UP :
                        // 터치가 떼어졌을 때
                        // 소리안남

                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                        // 터치가 두 개 이상 && 눌러졌을 때

                        // TodoList : 스크롤 움직이기
                        final int pointerIndex = (action & MotionEvent.ACTION_POINTER_INDEX_MASK) >> MotionEvent.ACTION_POINTER_INDEX_SHIFT;
                        // x = getX(pointerIndex);
                        // y = getY(pointerIndex);
                        break;
                }
                return true;
            }
        };
    }

    public void clickedKeyboard(View view) {
        switch (view.getId()) {
            //White KeyBoard Id
            case R.id.snare:
                pool.play(snare, 1, 1, 0, 0, 1);
                break;
            case R.id.highhat:
                pool.play(highhat, 1, 1, 0, 0, 1);
                break;
            case R.id.crash:
                pool.play(crash, 1, 1, 0, 0, 1);
                break;
            case R.id.ride:
                pool.play(ride, 1, 1, 0, 0, 1);
                break;
            case R.id.smalltom:
                pool.play(smalltom, 1, 1, 0, 0, 1);
                break;
            case R.id.largetom:
                pool.play(largetom, 1, 1, 0, 0, 1);
                break;
            case R.id.floortom:
                pool.play(floortom, 1, 1, 0, 0, 1);
                break;
            case R.id.basedrum:
                pool.play(basedrum, 1, 1, 0, 0, 1);
                break;
        }
    }



    public void getXmlId() {
        sv = findViewById(R.id.sv);
        snareBtn1 = findViewById(R.id.snare);
        highhatBtn1 = findViewById(R.id.highhat);
        crashBtn1 = findViewById(R.id.crash);
        rideBtn1 = findViewById(R.id.ride);
        smalltomBtn1 = findViewById(R.id.smalltom);
        largetomBtn1 = findViewById(R.id.largetom);
        floortomBtn1 = findViewById(R.id.floortom);
        basedrumBtn1 = findViewById(R.id.basedrum);

    }

    public void loadMusic() {
        pool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);

        //WhiteKeyBoard Soundpool
        snare = pool.load(this, R.raw.snare, 1);
        highhat = pool.load(this, R.raw.highhat, 1);
        crash = pool.load(this, R.raw.crash, 1);
        ride = pool.load(this, R.raw.ride, 1);
        smalltom = pool.load(this, R.raw.smalltom, 1);
        largetom = pool.load(this, R.raw.largetom, 1);
        floortom = pool.load(this, R.raw.floortom, 1);
        basedrum = pool.load(this, R.raw.basedrum, 1);


    }
}

