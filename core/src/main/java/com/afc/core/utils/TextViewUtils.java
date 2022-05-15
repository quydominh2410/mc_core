package com.afc.core.utils;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.core.text.HtmlCompat;

import com.afc.core.font.CustomTypefaceSpan;


public class TextViewUtils  {

    public static Spanned highLightText(String oldString, String highligh, String color) {
        String newString = oldString.replaceAll(highligh, "<font color='" + color + "'>" + highligh + "</font>");
        return HtmlCompat.fromHtml(newString, HtmlCompat.FROM_HTML_MODE_LEGACY);
    }

    public static Spanned highLightText(String oldString, String highligh) {
        String newString = oldString.replaceAll(highligh, "<font color='#0A73F0'>" + highligh + "</font>");
        return HtmlCompat.fromHtml(newString, HtmlCompat.FROM_HTML_MODE_LEGACY);
    }

    public static Spanned boldText(String oldString, String highligh, String color) {
        String newString = oldString.replaceAll(highligh, "<font color='" + color + "'>" + "<b>" + highligh + "</b>" + "</font>");
        return HtmlCompat.fromHtml(newString, HtmlCompat.FROM_HTML_MODE_LEGACY);
    }

    public static Spanned boldText(String oldString, String highligh, String hightligh2, String color) {
        String newString = oldString.replaceAll(highligh, "<font color='" + color + "'>" + "<b>" + highligh + "</b>" + "</font>")
                .replaceAll(hightligh2, "<font color='" + color + "'>" + "<b>" + hightligh2 + "</b>" + "</font>");
        return HtmlCompat.fromHtml(newString, HtmlCompat.FROM_HTML_MODE_LEGACY);
    }

    public static Spanned boldTextFeatureSearch(String oldString, String highligh, String color) {
        String newString = oldString.replaceAll(highligh, "<font color='" + color + "'>" + "<b>" + highligh + "</b>" + "</font>");
        return HtmlCompat.fromHtml(newString, HtmlCompat.FROM_HTML_MODE_LEGACY);
    }

    public static Spanned highLightTextCustom(String oldString, String highligh, String color) {
        String newString = oldString.replaceAll(highligh, "<br/><font color='" + color + "'>" + highligh + "</font>");
        return HtmlCompat.fromHtml(newString, HtmlCompat.FROM_HTML_MODE_LEGACY);
    }


    public static void setTextHightlightColor(TextView view, String fulltext, String subtext, int color) {
        view.setText(fulltext, TextView.BufferType.SPANNABLE);
        Spannable str = (Spannable) view.getText();
        int i = fulltext.indexOf(subtext);

        str.setSpan(new ForegroundColorSpan(color), i, i + subtext.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        str.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), i, i + subtext.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

    public static void setTextHightlightColor(TextView view, String fulltext, String subtext, String subtext2, int color) {
        view.setText(fulltext, TextView.BufferType.SPANNABLE);
        Spannable str = (Spannable) view.getText();
        int i = fulltext.indexOf(subtext);
        int j = fulltext.indexOf(subtext2);

        str.setSpan(new ForegroundColorSpan(color), i, i + subtext.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        str.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), i, i + subtext.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        str.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), j, j + subtext.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

}
