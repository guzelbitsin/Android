package com.example.volleyd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    //tarif ekleme ve silme için kullanacağımız metod

    Button btn_get, btn_post, btn_delete;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);

        btn_delete = (Button)findViewById(R.id.btn_delete);
        btn_get = (Button)findViewById(R.id.btn_get);
        btn_post = (Button)findViewById(R.id.btn_post);

        //sent event
        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyReq.getInstance(MainActivity2.this, new IVolley() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity2.this,""+response,
                                Toast.LENGTH_SHORT).show();
                    }
                })
                        .getRequest(
                                "https//jsonplaceholder.typicode.com/todos/1");
            }
        });

        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyReq.getInstance(MainActivity2.this, new IVolley() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity2.this,""+response,
                                Toast.LENGTH_SHORT).show();
                    }
                })
                        .postRequest(
                                "https//jsonplaceholder.typicode.com/posts");
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyReq.getInstance(MainActivity2.this, new IVolley() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity2.this,""+response,
                                Toast.LENGTH_SHORT).show();
                    }
                })
                        .deleteRequest(
                                "https//jsonplaceholder.typicode.com/posts");
            }
        });
    }



}
