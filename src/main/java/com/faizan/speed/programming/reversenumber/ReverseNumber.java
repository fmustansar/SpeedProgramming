package com.faizan.speed.programming.reversenumber;

public class ReverseNumber {

    public static int execute(int sourceNumber) {
        int result = 0;
        int lengthOfSource = Integer.toString(sourceNumber).length();
        for(int i=0; i<lengthOfSource;i++) {
            int digit;
            if(i==0) {
                //FM: We need to get the last digit with this approach always
                result = digit = sourceNumber % 10;
            } else { //FM: But from second-last digit onwards we need to remove the last digit and then do the same
                //FM: This is where we are removing the last digit by dividing the number by 10 (Simple Math)
                sourceNumber = (sourceNumber / 10);
                //FM: This is where we are getting the last digit(Simple Math)
                digit =  sourceNumber % 10;
                result = (result * 10) + digit;
            }
        }
        return result;
    }
}