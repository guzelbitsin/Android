package com.example.myapplication;

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
    public void recipeConfirm(View view) {
        Intent intent = new Intent(this, EnterTagActivity.class);
        startActivity(intent);
    }
}