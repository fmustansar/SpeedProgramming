package com.faizan.speed.programming.fizzbuzz;

/**
 * HackerRank question
 */
public class FizzBuzz {

    public static void execute() {
        int i=1;
        String toPrint = null;
        while(i<=100) {
            if(i%3 == 0 && i%5 == 0) {
                toPrint="FizzBuzz";
            } else if(i%3 == 0) {
                toPrint="Fizz";
            }  else if(i%5 == 0) {
                toPrint="Buzz";
            } else {
                toPrint=Integer.toString(i);
            }
            i++;
            System.out.println(toPrint);
        }
    }

}



