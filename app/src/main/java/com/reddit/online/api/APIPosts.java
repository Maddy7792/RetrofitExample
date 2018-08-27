package com.reddit.online.api;



import android.util.Log;

import com.reddit.online.Callbacks.ActivityCallback;
import com.reddit.online.Constants;
import com.reddit.online.Model.BaseModel;
import com.reddit.online.restservices.Client;

import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APIPosts {

    Call<BaseModel> postListCall;

    public void getPosts(String endpoint,final ActivityCallback activityCallback){
        postListCall = Client.getService().getPicsData(endpoint);
        postListCall.enqueue(new Callback<BaseModel>() {
            @Override
            public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                Log.d("Responce",""+response.isSuccessful() + "code"+response.code());
                if (response.isSuccessful() ){
                    Map map = new HashMap();
                    map.put(Constants.RESPONCE,response.body());
                    activityCallback.onSuccess(Constants.RESPONCE,map);
                }else {
                    activityCallback.onError(response.message());
                    activityCallback.onResponseCode(response.code());
                }
            }

            @Override
            public void onFailure(Call<BaseModel> call, Throwable t) {
                Log.d("Responce-error",""+t.getMessage());
                activityCallback.onError(t.getMessage());

            }
        });
    }
}
