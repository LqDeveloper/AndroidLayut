package com.example.android_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        setTitle("帧布局");
    }
}
