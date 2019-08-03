package com.example.corses.Util;

import android.content.Context;

import com.example.corses.model.Corses;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

public class Util {
    public static String loadJSONFromAsset(Context context , String fileNmae) {
        String json = null;
        try {
            InputStream is = context.getAssets().open(fileNmae);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
    public static Corses parseDeta(String json){
        Type type  = new TypeToken<Corses>(){}.getType();
        return new Gson().fromJson(json, type);
    }
}
