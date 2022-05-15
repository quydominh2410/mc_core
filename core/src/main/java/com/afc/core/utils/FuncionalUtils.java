package com.afc.core.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;

public class FuncionalUtils {

    /**
     * copy text
     *
     * @param context
     * @param text
     * @return created by NTHUY on 4/7/2021 1:31 PM
     */
    public static boolean copyToClipboard(Context context, String text) {
        try {
            int sdk = android.os.Build.VERSION.SDK_INT;
            if (sdk < android.os.Build.VERSION_CODES.HONEYCOMB) {
                android.text.ClipboardManager clipboard = (android.text.ClipboardManager) context
                        .getSystemService(Context.CLIPBOARD_SERVICE);
                clipboard.setText(text);
            } else {
                android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context
                        .getSystemService(Context.CLIPBOARD_SERVICE);
                android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", text);
                clipboard.setPrimaryClip(clip);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * send tin nhắn messenger
     *
     * @param activity created by Huynt on 05/05/2021
     */
    public static void sendMesenger(Activity activity, String content, String packageName) {
        try {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, content);
            sendIntent.setType("text/plain");
            sendIntent.setPackage(packageName);
            activity.startActivity(sendIntent);
        } catch (ActivityNotFoundException ex) {
            Toast.makeText(activity,
                    "Oups!Can't open Facebook messenger right now. Please try again later.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public static void makeCall(Context context, String number) {
        if (!TextUtils.isEmpty(number)) {
            Intent call = new Intent(Intent.ACTION_DIAL);
            call.setData(Uri.parse("tel:" + number));
            context.startActivity(call);
        }
    }

    /**
     * chia sẻ qua app hệ thống
     * created by NTHUY on 4/7/2021 3:11 PM
     */
    public static void shareApp(Context context,String appName, String shareMessage) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, appName);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            context.startActivity(Intent.createChooser(shareIntent, "Chọn"));
    }

    public static void sendEmail(Context context, String email) {
        Intent emailSelectorIntent = new Intent(Intent.ACTION_SENDTO);
        emailSelectorIntent.setData(Uri.parse("mailto:"));
        final Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
        emailIntent.setSelector(emailSelectorIntent);
        context.startActivity(Intent.createChooser(emailIntent, "Chọn"));
    }



}
