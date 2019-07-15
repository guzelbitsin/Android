package com.example.myapplication;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;


public class ReadHttpTask extends AsyncTask<String, Void, CharSequence> {
    @Override
    protected CharSequence doInBackground(String... urls) {
        String urlString = urls[0];
        try {
            CharSequence result = HTTPHelper.GetHttpResponse(urlString);
            return result;
        } catch (IOException ex) {
            cancel(true);
            String errorMessage = ex.getMessage() + "\n" + urlString;
            Log.e("Recipe", errorMessage);
            return errorMessage;
        }
    }
}