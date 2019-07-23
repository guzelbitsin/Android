package com.example.volleyd;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MyReq {
    private static MyReq instance;
    private RequestQueue requestQueue;
    private Context context;
    private IVolley iVolley;

    private MyReq(Context context, IVolley iVolley){
        this.context = context;
        this.iVolley = iVolley;
        requestQueue = getRequestQueue();
    }

    private MyReq(Context context){
        this.context = context;
        requestQueue = getRequestQueue();
    }

    public static synchronized MyReq getInstance(Context context){
        instance = new MyReq(context);
        return instance;
    }

    public static synchronized MyReq getInstance(Context context, IVolley iVolley){
        instance = new MyReq(context,iVolley);
        return instance;
    }

    private RequestQueue getRequestQueue() {
        if (requestQueue == null)
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        return requestQueue;
    }

    public <T> void addToRequestQueue (Request<T> request){
        getRequestQueue().add(request);
    }

    //get method
    public void getRequest(String url){
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET,
                url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                iVolley.onResponse(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                iVolley.onResponse(error.getMessage());
            }
        });
        addToRequestQueue(getRequest);
    }

    //post method
    public void postRequest(String url){
        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        iVolley.onResponse(response.toString());
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        iVolley.onResponse(error.getMessage());
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("name", "Alif");
                params.put("domain", "http://itsalif.info");

                return params;
            }
        };
        addToRequestQueue(postRequest);
    }

    //delete method
    public void deleteRequest(String url){
        JsonObjectRequest deleteReq = new JsonObjectRequest(Request.Method.DELETE,
                url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                iVolley.onResponse(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                iVolley.onResponse(error.getMessage());
            }
        });
        addToRequestQueue(deleteReq);
    }
}
