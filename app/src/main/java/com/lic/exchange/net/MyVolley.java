package com.lic.exchange.net;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by lichong on 16/7/19.
 */
public class MyVolley {
    private static RequestQueue requestQueue;

    private MyVolley(){

    }

    public static void init(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public static void exec(Request request) {
        requestQueue.add(request);
    }

    public static String buildFullUrl(String suffix) {
        return "http://10.0.3.2:8080/Exchange" + suffix;
    }
}
