package com.SuperPower;

import java.text.NumberFormat;
import java.util.Locale;

public class InitCurrency extends Currency {
    public static double str3;
        static String printCurrency(Locale locale){
            NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
            return formatter.format(str3);
        }

    }



