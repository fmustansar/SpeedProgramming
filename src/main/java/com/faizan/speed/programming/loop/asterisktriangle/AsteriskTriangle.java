package com.faizan.speed.programming.loop.asterisktriangle;

public class AsteriskTriangle {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        */

        for(int i=0; i<5; i++) {
            for(int j=0;j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");

        /*
         *****
         ****
         ***
         **
         *
         */

        for(int i=5; i>0; i--) {
            for(int j=1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}

