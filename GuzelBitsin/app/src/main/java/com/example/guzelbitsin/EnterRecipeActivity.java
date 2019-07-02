package com.example.guzelbitsin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;


import android.os.Bundle;

public class EnterRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enterrecipeactivity);
    }
    public void confirm1(View view) {
        Intent intent = new Intent(this, EnterTagActivity.class);
        startActivity(intent);
    }
}
