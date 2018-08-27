package com.reddit.online.manager;

import android.content.Context;

import com.reddit.online.Callbacks.ActivityCallback;
import com.reddit.online.api.APIPosts;

import java.util.Map;

public class ActivityManager {
    private Context context;
    private APIPosts apiQuestions = new APIPosts();
    public ActivityManager(Context context) {
        this.context = context;
    }

    public void getPosts(String endpoint,final ActivityCallback activityCallback){
        apiQuestions.getPosts(endpoint,new ActivityCallback() {
            @Override
            public void onSuccess(String success, Map map) {
                activityCallback.onSuccess(success,map);
            }

            @Override
            public void onError(String error) {activityCallback.onError(error);
            }

            @Override
            public void onResponseCode(int code) {
                activityCallback.onResponseCode(code);
            }
        });
    }
}
