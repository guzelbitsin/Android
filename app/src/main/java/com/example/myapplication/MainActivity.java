package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
    }

    public void createNewRecipe(View view) {
        Intent intent = new Intent(this, EnterRecipeActivity.class);
        startActivity(intent);
    }

    public void myRecipes(View view) {
        Intent intent = new Intent( this, MyRecipesActivity.class);
        startActivity(intent);
    }

}