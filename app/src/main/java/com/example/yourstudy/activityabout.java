package com.example.yourstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityabout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityabout);
    }
    Button aboutButton = findViewById(R.id.aboutButton);
    aboutButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, activityabout.class);
    startActivity(intent);
    }
}