package com.reddit.online.Model;

import com.google.gson.annotations.SerializedName;

public class SecureMedia {

    @SerializedName("oembed")
    private Oembed oembed;

    @SerializedName("type")
    private String type;

    public Oembed getOembed ()
    {
        return oembed;
    }

    public void setOembed (Oembed oembed)
    {
        this.oembed = oembed;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }
}
