package com.afc.core.analytics;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;

import java.util.HashMap;
import java.util.Map;

/**
 * created by NTHUY on 8/5/2021 10:49 AM
 */
public class AppsflyerAnalytics {
    public static void logAppsflyerEvent(Context context,String type, String username, String phone) {
        Map<String, Object> eventValues = new HashMap<String, Object>();
        eventValues.put(AFInAppEventParameterName.CONTENT_TYPE, type);
        eventValues.put(AFInAppEventParameterName.CONTENT_ID, username);
        eventValues.put("af_phone", phone);

        AppsFlyerLib.getInstance().logEvent(context,
                type,
                eventValues,
                new AppsFlyerRequestListener() {
                    @Override
                    public void onSuccess() {
                        Log.d("logAppsflyerEvent", "Event sent successfully");
                    }

                    @Override
                    public void onError(int i, @NonNull String s) {
                        Log.d("logAppsflyerEvent", "Event failed to be sent:\n" +
                                "Error code: " + i + "\n"
                                + "Error description: " + s);
                    }
                });
    }
}
