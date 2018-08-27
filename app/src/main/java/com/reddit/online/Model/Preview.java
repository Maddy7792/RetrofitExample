package com.reddit.online.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Preview {

    @SerializedName("enabled")
    private boolean enabled;
    @SerializedName("images")
    private ArrayList<Images> images = new ArrayList<>();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ArrayList<Images> getImages() {
        return images;
    }

    public void setImages(ArrayList<Images> images) {
        this.images = images;
    }
}
