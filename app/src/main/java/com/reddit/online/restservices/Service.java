package com.reddit.online.restservices;

import com.reddit.online.Model.BaseModel;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {

    @GET("{endpoint}"+".json")
    Call<BaseModel> getPicsData(@Path("endpoint") String endpoint);
}
