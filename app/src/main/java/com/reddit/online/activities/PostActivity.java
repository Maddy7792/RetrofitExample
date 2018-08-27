package com.reddit.online.activities;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.reddit.online.Callbacks.ActivityCallback;
import com.reddit.online.Callbacks.onAnswerClickListener;
import com.reddit.online.Constants;
import com.reddit.online.Model.BaseModel;
import com.reddit.online.Model.Children;
import com.reddit.online.R;
import com.reddit.online.adapters.PostsAdapter;
import com.reddit.online.manager.ActivityManager;
import com.reddit.online.utils.Utils;


import java.util.ArrayList;
import java.util.Map;

public class PostActivity extends AppCompatActivity implements onAnswerClickListener {

    private ActivityManager activityManager;
    private ArrayList<String> list;
    private ArrayList<String> answersList;
    private RecyclerView rvPosts;
    private LinearLayoutManager linearLayoutManager;
    private PostsAdapter postsAdapter;
    private String deviceId;
    private BaseModel baseModel;
    private LottieAnimationView lottieAnimationView;
    private boolean isNetworkConnected;
    private String endpoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        rvPosts = findViewById(R.id.rv_questions_list);
        activityManager = new ActivityManager(this);
        lottieAnimationView = findViewById(R.id.loading);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvPosts.setLayoutManager(linearLayoutManager);
        deviceId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        list = new ArrayList<>();
        answersList = new ArrayList<>();
        showProgressBar();
        if (getIntent() != null) {
            endpoint = getIntent().getExtras().getString(Constants.ENDPOINT);
            Log.d("ENDPoint",""+endpoint);
            getAllPosts(endpoint);
        }


    }

    private void getAllPosts(String endpoint) {
        activityManager.getPosts(endpoint, new ActivityCallback() {
            @Override
            public void onSuccess(String success, Map map) {
                if (isNetworkConnected) {
                    hideProgressBar();
                    baseModel = (BaseModel) map.get(Constants.RESPONCE);
                    if (baseModel != null) {
                        setPostAdapter(baseModel.getData().getChildren());
                    }
                } else {
                    hideProgressBar();
                }

            }

            @Override
            public void onError(String error) {

            }

            @Override
            public void onResponseCode(int code) {

            }
        });
    }

    private void setPostAdapter(ArrayList<Children> baseModel) {
        postsAdapter = new PostsAdapter(this);
        postsAdapter.setData(baseModel);
        rvPosts.setAdapter(postsAdapter);
        postsAdapter.notifyDataSetChanged();

    }


    @Override
    protected void onStart() {
        super.onStart();
        isNetworkConnected = Utils.isInternetConnected(PostActivity.this);
    }

    @Override
    public void onClick(View view, int position) {
        Log.d("Position", "" + position);
    }


    public void showProgressBar() {
        lottieAnimationView.playAnimation();
        lottieAnimationView.setVisibility(View.VISIBLE);
    }

    public void hideProgressBar() {
        lottieAnimationView.setVisibility(View.GONE);
    }
}
