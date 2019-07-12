package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import com.example.myapplication.Model.Yemek;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnCallRestApi;

    HttpHandler httpHandler ;
    ProgressDialog progressDialog;

    ArrayList<Yemek> yemekArrayList;
    private static String urlAddress = "https://raw.githubusercontent.com/serifgungor/deneme/master/yemekler.json" ;

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

        yemekArrayList = new ArrayList<>();
        new getRecipe().execute();
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

    private class getRecipe extends AsyncTask<Void,Void,Void>{


        @Override
        protected void onPreExecute() {
            //islem basladiginda

            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Lutfen bekleyiniz");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        protected void onPostExecute(Void aVoid){
            //islem tamamlandiginda

            super.onPostExecute(aVoid);
            if(progressDialog.isShowing())
                progressDialog.dismiss();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            //islemin gerceklestirme zamaninda

            httpHandler = new HttpHandler();

            //icine url adresini vericem
            String jsonString = httpHandler.makeServiceCall(urlAddress);

            Log.d("JSON_RESPONSE",jsonString);

            if(jsonString != null){


                try {
                    JSONObject jsonObject = new JSONObject(jsonString);
                    //json dosyasındaki tag, baslik adi
                    JSONArray yemekler = jsonObject.getJSONArray("yemekler");
                    for (int i = 0;i<yemekler.length();i++){
                        JSONObject yemek = yemekler.getJSONObject(i);
                        int yemekId = yemek.getInt("yemek_id");
                        String yemekAdi = yemek.getString("yemek_adi");
                        String yemekAciklama = yemek.getString("yemek_aciklama");
                        String yemekTur = yemek.getString("yemek_tur");
                        String yemekPisirmeSuresi = yemek.getString("yemek_pisirme_suresi");
                        String yemekHazirlamaSuresi = yemek.getString("yemek_hazirlama_suresi");
                        String yemekKisiSayisi = yemek.getString("yemek_kisi_sayisi");
                        String yemekResim = yemek.getString("yemek_resim");
                        String yemekMalzemeler = yemek.getString("yemek_malzemeler");

                        Yemek yemek1 = new Yemek(yemekId,yemekAdi,yemekAciklama,
                                yemekTur,yemekPisirmeSuresi,yemekHazirlamaSuresi,
                                yemekKisiSayisi,yemekResim,yemekMalzemeler);
                        yemekArrayList.add(yemek1);
                    }
                }catch (Exception e){

                }

            }else{
                Log.d("JSON_RESPONSE","Sayfa kaynagi bos");
            }

            return null;
        }
    }

}