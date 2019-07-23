package com.example.volleyd;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void createNewRecipe(View view) {
        //      Intent intent = new Intent(this, EnterRecipeActivity.class);
        //    startActivity(intent);
    }

    public void myRecipes(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}