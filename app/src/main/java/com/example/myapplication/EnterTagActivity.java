package com.example.myapplication;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EnterTagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entertagactivity);
    }
    public void tagConfirm(View view) {
        Intent intent = new Intent(this, ChoosePhotoActivity.class);
        startActivity(intent);
    }
}