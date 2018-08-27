package com.reddit.online.Model;

import com.google.gson.annotations.SerializedName;

public class Resolutions {

    @SerializedName("height")
    private String height;
    @SerializedName("width")
    private String width;
    @SerializedName("url")
    private String url;

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }
}
