package com.reddit.online.Model;

import com.google.gson.annotations.SerializedName;

public class Children {

    @SerializedName("data")
    private ChildData data;

    @SerializedName("kind")
    private String kind;

    public ChildData getData() {
        return data;
    }

    public void setData(ChildData data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
