package com.afc.core.utils;

import android.text.TextUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
//import com.google.common.base.Strings;


public class DateTimeUtils {
    public static String getNameOfDay(Calendar calendar) {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                return "Chủ Nhật";
            case 2:
                return "Thứ Hai";
            case 3:
                return "Thứ Ba";
            case 4:
                return "Thứ Tư";
            case 5:
                return "Thứ Năm";
            case 6:
                return "Thứ Sáu";
            case 7:
                return "Thứ Bảy";
            default:
                return "";

        }
    }


    public static String formatDate(String old) {
        if (old == null) {
            return "";
        }
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(old);
        } catch (ParseException e) {
            return old;
        }
        DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
        return df2.format(date1 != null ? date1 : "");
    }

    public static String formatDateDDMMYYYYHHMM(String old) {
        if (old == null) {
            return "";
        }
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(old);
        } catch (ParseException e) {
            return old;
        }
        DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return df2.format(date1 != null ? date1 : "");
    }


    public static Calendar convertStringToDate(String value) {
        Calendar calendar = Calendar.getInstance();
        try {
            if (TextUtils.isEmpty(value)) {
                return calendar;
            }

            DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

            if (df2.parse(value) != null) {
                calendar.setTime(Objects.requireNonNull(df2.parse(value)));
            }

            return calendar;
        } catch (Exception e) {

            return calendar;
        }
    }

    public static Integer calculateRemainingTime(String startDate, String endDate) {
        if (TextUtils.isEmpty(startDate) || TextUtils.isEmpty(endDate))
            return null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(startDate);
            d2 = format.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        long diff = d2.getTime() - d1.getTime();
        int diffDay = (int) (diff / 86400000);
        return diffDay;
    }

    public static String getNewDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String nameOfDay = getNameOfDay(calendar);
        if (calendar.get(Calendar.MINUTE) < 10) {
            return nameOfDay + ", " + formatter.format(date) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":0" + calendar.get(Calendar.MINUTE);
        }
        return nameOfDay + ", " + formatter.format(date) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE);
    }

    /**
     * xóa bỏ giờ,phút, giây
     *
     * @param date
     * @return create by Huynt on 6/16/2021
     */
    public static Calendar removeTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }


    /**
     * lấy ngày hiện tại
     *
     * @return created by NTHUY on 9/17/2021 9:24 AM
     */
    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
        return sdf.format(new Date());
    }
}
