package com.reddit.online.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.reddit.online.Constants;
import com.reddit.online.R;
import com.reddit.online.utils.Utils;

public class SplashActivity extends AppCompatActivity {

    ImageView mIVSplash;
    Animation fadeAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        Utils.setThemeStatusColor(SplashActivity.this, Constants.COLOR);
        setContentView(R.layout.activity_splash);
        mIVSplash = findViewById(R.id.iv_splash_image);
        fadeAnimation = AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        mIVSplash.startAnimation(fadeAnimation);
        fadeAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Utils.setIntent(SplashActivity.this,RedditListActivity.class);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
