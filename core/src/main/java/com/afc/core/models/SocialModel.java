package com.afc.core.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SocialModel {
    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("socialId")
    @Expose
    private String socialId;

    public SocialModel() {
    }

    public SocialModel(String type, String socialId) {
        this.type = type;
        this.socialId = socialId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }
}
