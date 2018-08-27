package com.reddit.online.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.reddit.online.Callbacks.onAnswerClickListener;
import com.reddit.online.Constants;
import com.reddit.online.R;
import com.reddit.online.adapters.RedditMenuAdapter;
import com.reddit.online.utils.Utils;

import java.util.ArrayList;

public class RedditListActivity extends AppCompatActivity implements onAnswerClickListener {

    private RecyclerView gridRVPosts;
    private GridLayoutManager gridLayoutManager;
    private RedditMenuAdapter redditMenuAdapter;
    private LottieAnimationView lottieAnimationView;
    private int[] imagesList = {R.drawable.reddit,R.drawable.reddit_2,R.drawable.reddit_3,
            R.drawable.reddit_4,R.drawable.reddit_5,R.drawable.reddit_6,R.drawable.reddit_7
    ,R.drawable.reddit_8,R.drawable.reddit_9,R.drawable.reddit_10};
    private ArrayList<String> redditTextlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit_list);
        gridRVPosts = findViewById(R.id.rv_reddit_list);
        lottieAnimationView = findViewById(R.id.background);
        gridLayoutManager = new GridLayoutManager(this,3, LinearLayoutManager.VERTICAL,false);
        gridRVPosts.setLayoutManager(gridLayoutManager);
        gridRVPosts.setHasFixedSize(true);
        redditTextlist = new ArrayList<>();
        redditTextlist = Utils.getRedditList();
        getData();

    }

    private void getData() {
        redditMenuAdapter = new RedditMenuAdapter(this);
        redditMenuAdapter.setData(imagesList,redditTextlist);
        gridRVPosts.setAdapter(redditMenuAdapter);
        redditMenuAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view, int position) {
        String itemList = redditTextlist.get(position);
        Intent intent = new Intent(RedditListActivity.this,PostActivity.class);
        intent.putExtra(Constants.ENDPOINT,itemList);
        startActivity(intent);
        Log.d("List",""+itemList);
    }
}
