package com.example.myapplication;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//http:url
public class HttpHandler {
    public HttpHandler(){

    }

    public String makeServiceCall(String requestUrl){
        String response = null;

        try {
            URL url = new URL(requestUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream inp = new BufferedInputStream(connection.getInputStream());
            response = convertStreamToString(inp);
        }catch (MalformedURLException e){

        }catch (IOException e){

        }
        return response;
    }

    private String convertStreamToString(InputStream st){
        BufferedReader reader = new BufferedReader(new InputStreamReader(st));
        StringBuilder sb = new StringBuilder();

        String satir = "";

        try {
            while ((satir = reader.readLine()) != null){
                sb.append(satir).append("\n");
            }

        }catch (IOException e){

        }finally {
            try {
                st.close();
            }catch (IOException e){

            }

        }
        return sb.toString();
    }
}
