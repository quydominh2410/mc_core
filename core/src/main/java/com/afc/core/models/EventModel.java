package com.afc.core.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventModel {
    @SerializedName("events_name")
    @Expose
    public String events_name;

    @SerializedName("joined")
    @Expose
    public boolean joined;

    public EventModel() {
    }

}
