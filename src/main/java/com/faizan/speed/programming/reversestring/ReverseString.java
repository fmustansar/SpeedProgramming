package com.faizan.speed.programming.reversestring;

public class ReverseString {

    public static String executeUsingStringBuilderReverse(String sourceString) {
        StringBuilder sb = new StringBuilder(sourceString);
        sb.reverse();
        return sb.toString();

    }

    public static String executeUsingManualApproach(String sourceString) {
        String result = "";
        for(int i = sourceString.length()-1; i>=0; i--) {
            result = result + sourceString.charAt(i); //FM: But on all occassions it will create a new string and place it in string pool
        }
        return result;
    }

    public static String executeUsingStringAndStringBuilderWithoutReverse(String sourceString) {
        StringBuilder sb = new StringBuilder();
        for(int i = sourceString.length()-1; i>=0; i--) {
            sb.append(sourceString.charAt(i));
        }
        return sb.toString();
    }


}
