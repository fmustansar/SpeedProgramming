package com.faizan.speed.programming.integertoroman;

public class IntegerToRomanNumeral {
    public static String execute(int sourceNumber) {
        /**
         * What are roman numerals
         *
         * I - 1
         * V - 5
         * X - 10
         * L - 50
         * C - 100
         * D - 500
         * M - 1000
         *
         * What would be the upper limit -> 3000
         */
        String[] units      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens       = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds   = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "MC"};
        String[] thousands  = {"", "M", "MM", "MMM"};

        return thousands[sourceNumber/1000] + hundreds[(sourceNumber%100)/100]+tens[(sourceNumber%10)/10]+units[(sourceNumber%10)];
    }

//    private static String provideSuitableRomanForDigit(int digit, int place) {
//        String romanOutput = "";
//        if(digit == 0) {
//            return romanOutput;
//        }
//        if(place == 0) {
//            if(digit<=3) {
//                for(int i=0;i<digit;i++) {
//                    romanOutput = romanOutput + "I";
//                }
//            }
//        } else if ()
//        return romanOutput;
//    }
}
