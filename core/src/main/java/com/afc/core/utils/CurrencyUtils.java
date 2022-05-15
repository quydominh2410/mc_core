package com.afc.core.utils;



import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtils {

    public static String formatMoney(Long money) {
        try {
            if (money == null) {
                return "0 VNĐ";
            }
            Locale locale = new Locale("da", "DK");
            String pattern = "###,###.###";
            DecimalFormat decimalFormat = (DecimalFormat)
                    NumberFormat.getNumberInstance(locale);
            decimalFormat.applyPattern(pattern);
            return decimalFormat.format(money) + " VND";
        } catch (Exception e) {

            return money.toString() + " VND";
        }

    }

    public static String formatMoneyDouble(Double money) {
        try {
            if (money == null) {
                return "0 VNĐ";
            }
            Locale locale = new Locale("da", "DK");
            String pattern = "###,###.###";
            DecimalFormat decimalFormat = (DecimalFormat)
                    NumberFormat.getNumberInstance(locale);
            decimalFormat.applyPattern(pattern);
            return decimalFormat.format(money) + " VND";
        } catch (Exception e) {

            return money.toString() + " VND";
        }

    }

    public static String formatMoneyNotVnd(Long money) {
        try {
            if (money == null) {
                return "0";
            }
            Locale locale = new Locale("da", "DK");
            String pattern = "###,###.###";
            DecimalFormat decimalFormat = (DecimalFormat)
                    NumberFormat.getNumberInstance(locale);
            decimalFormat.applyPattern(pattern);
            return decimalFormat.format(money);
        } catch (Exception e) {

            return money.toString();
        }

    }


    /**
     * chuyển đổi 1000000L -> 1 triệu
     *
     * @param
     * @return create by Huynt on 11/12/2021
     */
    public static String convertMoney(long value) {
        long million = 1000000L;
        long billion = 1000000000L;
        if ((value >= million) && (value < billion)) {
            long fraction = value / million;
            return fraction + " triệu VND";
        } else if (value >= billion) {
            long fraction = value / billion;
            return fraction + " tỷ VND";
        }
        return value + " VND";
    }



}
