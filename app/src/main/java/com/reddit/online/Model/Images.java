package com.reddit.online.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Images {
    @SerializedName("id")
    private String id;
    @SerializedName("source")
    private Source source;
    @SerializedName("resolutions")
    private ArrayList<Resolutions> resolutions = new ArrayList<>();

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Source getSource ()
    {
        return source;
    }

    public void setSource (Source source)
    {
        this.source = source;
    }

    public ArrayList<Resolutions> getResolutions() {
        return resolutions;
    }

    public void setResolutions(ArrayList<Resolutions> resolutions) {
        this.resolutions = resolutions;
    }
}
