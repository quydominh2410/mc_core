package com.afc.core.analytics;


import com.afc.core.R;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/**
 * Created bu AnhNH on 4/5/2021
 */
public class RemoteConfig {
    FirebaseRemoteConfig mFirebaseRemoteConfig;
    static RemoteConfig instance;

    static RemoteConfig getInstance() {
        if(instance == null){
            instance = new RemoteConfig();
        }
        return instance;
    }

    public RemoteConfig() {
        init();
    }

    void init() {
        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .build();
        mFirebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);
        mFirebaseRemoteConfig.fetchAndActivate().addOnSuccessListener(command -> {
            //TODO
//            String json = RemoteConfig.getConfig().getString("slide_dashboard");
//            if(!TextUtils.isEmpty(json)){
//                SharePreferenceUtil.saveStringPref("slide_dashboard", json);
//            }
        });
    }

    public static FirebaseRemoteConfig getConfig() {
        return getInstance().mFirebaseRemoteConfig;
    }
}
