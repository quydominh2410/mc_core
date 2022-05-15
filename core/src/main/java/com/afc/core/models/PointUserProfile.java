package com.afc.core.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PointUserProfile extends BaseObserverModel<PointUserProfile> {
    @SerializedName("point")
    @Expose
    public int point;

    @SerializedName("totalPoint")
    @Expose
    public Integer totalPoint;

    @SerializedName("maxPoint")
    @Expose
    public int maxPoint;

    @SerializedName("minPoint")
    @Expose
    public int minPoint;

    @SerializedName("rankNameCurrent")
    @Expose
    public String rankNameCurrent;

    @SerializedName("nextRankNameCurrent")
    @Expose
    public String nextRankNameCurrent;

    @SerializedName("type")
    @Expose
    public String type;

}
