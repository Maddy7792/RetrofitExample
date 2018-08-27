package com.reddit.online.restservices;

import android.content.Context;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static Service service;
    public static Retrofit retrofit;
    private Context context;
    private static String BASE_URL = "https://www.reddit.com/r/";

    public Client(Context context) {
        this.context = context;
    }

    public static Service getService(){
        if (service == null){
            service = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(new StringConverterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(Service.class);
        }
        return service;
    }

    static class StringConverterFactory extends Converter.Factory {

        @Override
        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations
                , Retrofit retrofit) {

            if (TypeToken.get(type).getRawType().isAssignableFrom(String.class)) {
                return new Converter<ResponseBody, String>() {
                    @Override
                    public String convert(ResponseBody value) throws IOException {
                        return value.string();
                    }
                };
            }
            return null;
        }

    }
}
