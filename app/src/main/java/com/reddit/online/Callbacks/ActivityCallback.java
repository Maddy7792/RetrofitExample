package com.reddit.online.Callbacks;

import java.util.Map;

public interface ActivityCallback {
    public void onSuccess(String success, Map map);
    public void onError(String error);
    public void onResponseCode(int code);
}
