package com.example.android_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("主页");
        goToActivity();
    }


    private void  goToActivity(){
        TextView linearTextView = findViewById(R.id.linearLayout);
        linearTextView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,LinearActivity.class);
            startActivity(intent);
        });

        TextView tableTextView = findViewById(R.id.tableLayout);
        tableTextView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,TableActivity.class);
            startActivity(intent);
        });

        TextView frameTextView = findViewById(R.id.frameLayout);
        frameTextView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,FrameActivity.class);
            startActivity(intent);
        });

        TextView constraintTextView = findViewById(R.id.constraintLayout);
        constraintTextView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,ConstraintActivity.class);
            startActivity(intent);
        });
    }

}
