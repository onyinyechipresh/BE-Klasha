package com.CharlanBank.utils;

import java.time.Year;

public class AccountNumberUtil {
    public static String generateAccountNumber(){
        /**
         * currentYear + currentSixDigit
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        // todo: generate random number between min and max
        int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        // Todo: convert current year and randomNumber to string then concatenate
        String year = String.valueOf(currentYear);
        String randNumber = String.valueOf(randomNumber);
        StringBuilder accountNUmber = new StringBuilder();
        return accountNUmber.append(year).append(randNumber).toString();
    }
}
