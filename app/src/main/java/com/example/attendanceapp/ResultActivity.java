package com.teproject.training.parent_teacher_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        sem3 = (ImageView) findViewById(R.id.sem3);
        sem4 = (ImageView) findViewById(R.id.sem4);
        sem5 = (ImageView) findViewById(R.id.sem5);
        sem6 = (ImageView) findViewById(R.id.sem6);
        sem7 = (ImageView) findViewById(R.id.sem7);
        sem8 = (ImageView) findViewById(R.id.sem8);

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResultActivity.this, Sem6Activity.class);
                startActivity(intent);
            }
        });
    }
}