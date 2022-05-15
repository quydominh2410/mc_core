package com.afc.core.analytics;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.appcenter.analytics.Analytics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created bu AnhNH on 4/19/2021
 */
public class AppAnalytics {

    public static void logAppcenter(String param, String id, String name) {
        Bundle params = new Bundle();
        params.putString(id, name);
        Map<String, String> properties = new HashMap<>();
        properties.put(id, name);
        Analytics.trackEvent(param, properties);
    }

    public static void logFireBase(Context context, String event, Bundle bundle) {
        FirebaseAnalytics.getInstance(context).logEvent(event, bundle);
    }


}
