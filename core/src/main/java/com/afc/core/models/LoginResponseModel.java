package com.afc.core.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class LoginResponseModel extends BaseObserverModel<LoginResponseModel> {

    @SerializedName("access_token")
    private String aceess_token;

    @SerializedName("expires_in")
    private long expires_in;

    @SerializedName("refresh_expires_in")
    private long refresh_expires_in;

    @SerializedName("refresh_token")
    private String refresh_token;

    @SerializedName("token_type")
    private String token_type;

    @SerializedName("id_token")
    private String id_token;

    @SerializedName("not_before_policy")
    private long not_before_policy;

    @SerializedName("session_stage")
    private String session_stage;

    @SerializedName("scope")
    private String scope;

    @SerializedName("isExistSocial")
    private boolean isExistSocial; // "true : nếu trùng với socialId hiện đang có, false:nếu số điện thoại đó đã liên kết với 1 socialId khác (nếu chưa có social thì thêm mới luôn)"

    @SerializedName("user_social")
    private List<SocialModel> user_social;

    @SerializedName("user_events")
    private List<EventModel> user_events;

    @SerializedName("user_profile")
    private UserProfile userProfile;

    public LoginResponseModel() {
    }

    public LoginResponseModel(String aceess_token, long expires_in, long refresh_expires_in, String refresh_token, String token_type, String id_token, long not_before_policy, String session_stage, String scope, UserProfile userProfile) {
        this.aceess_token = aceess_token;
        this.expires_in = expires_in;
        this.refresh_expires_in = refresh_expires_in;
        this.refresh_token = refresh_token;
        this.token_type = token_type;
        this.id_token = id_token;
        this.not_before_policy = not_before_policy;
        this.session_stage = session_stage;
        this.scope = scope;
        this.userProfile = userProfile;
    }

    public String getAceess_token() {
        return aceess_token != null ? aceess_token : "";
    }

    public void setAceess_token(String aceess_token) {
        this.aceess_token = aceess_token;
    }

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }

    public long getRefresh_expires_in() {
        return refresh_expires_in;
    }

    public void setRefresh_expires_in(long refresh_expires_in) {
        this.refresh_expires_in = refresh_expires_in;
    }

    public String getRefresh_token() {
        return refresh_token != null ? refresh_token : "";
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getToken_type() {
        return token_type != null ? token_type : "";
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getId_token() {
        return id_token != null ? id_token : "";
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }

    public long getNot_before_policy() {
        return not_before_policy;
    }

    public void setNot_before_policy(long not_before_policy) {
        this.not_before_policy = not_before_policy;
    }

    public String getSession_stage() {
        return session_stage;
    }

    public void setSession_stage(String session_stage) {
        this.session_stage = session_stage;
    }

    public boolean getIsExistSocial() {
        return isExistSocial;
    }

    public void setIsExistSocial(boolean isExistSocial) {
        this.isExistSocial = isExistSocial;
    }

    @Override
    public String toString() {
        return "LoginRespoModel{" +
                "aceess_token='" + aceess_token + '\'' +
                ", expires_in='" + expires_in + '\'' +
                ", refresh_expires_in='" + refresh_expires_in + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", token_type='" + token_type + '\'' +
                ", id_token='" + id_token + '\'' +
                ", not_before_policy=" + not_before_policy +
                ", session_stage='" + session_stage + '\'' +
                ", scope='" + scope + '\'' +
                ", userProfile=" + userProfile +
                '}';
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public UserProfile getUserProfile() {
        return userProfile == null ? new UserProfile() : userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public boolean isExistSocial() {
        return isExistSocial;
    }

    public void setExistSocial(boolean existSocial) {
        isExistSocial = existSocial;
    }

    public List<SocialModel> getUser_social() {
        return user_social;
    }

    public void setUser_social(List<SocialModel> user_social) {
        this.user_social = user_social;
    }

    public List<EventModel> getUser_events() {
        return user_events;
    }

    public void setUser_events(List<EventModel> user_events) {
        this.user_events = user_events;
    }
}

