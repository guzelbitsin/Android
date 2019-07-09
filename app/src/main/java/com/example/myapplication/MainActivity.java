package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCallRestApi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        btnCallRestApi = (Button) findViewById(R.id.btnCallRestApi);
        btnCallRestApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call rest api

            }
        });
    }

    public void createNewRecipe(View view) {
        Intent intent = new Intent(this, EnterRecipeActivity.class);
        startActivity(intent);
    }

    public void myRecipes(View view) {
        Intent intent = new Intent( this, MyRecipesActivity.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent( this, SearchUsersResult.class);
        startActivity(intent);
    }

}