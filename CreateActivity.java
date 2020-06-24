package com.example.test;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.view.View.OnClickListener;

import android.widget.ImageView;
import android.widget.TextView;




public class CreateActivity extends Activity implements OnClickListener {

    Button bt, bt2, bt3;
    ImageView iv;
    TextView tv;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        // xml에 불러온 이미뷰를 bt에 넣어 속성사용 하기위한 구문
        bt = (Button) findViewById(R.id.bt_akbo1);
        bt2 = (Button) findViewById(R.id.bt_akbo2);
        bt3 = (Button) findViewById(R.id.bt_akbo3);

        // 버튼에 클릭이벤트 처리
        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

        // xml에 불러온 이미뷰를 iv에 넣어 속성사용 하기위한 구문
        iv = (ImageView) findViewById(R.id.imageView8);

    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub

        switch (arg0.getId()) {

            case R.id.bt_akbo1:


                iv.setImageResource(R.drawable.img_example3);

                tv.setText("test1 사진");

                break;

            case R.id.bt_akbo2:

                iv.setImageResource(R.drawable.img_example4);
                tv.setText("test2 사진");

                break;

            case R.id.bt_akbo3:

                iv.setImageResource(R.drawable.img_example5);
                tv.setText("test3 사진");

                break;


        }

    }





}