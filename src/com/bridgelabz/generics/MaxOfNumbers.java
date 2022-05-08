package com.bridgelabz.generics;

// CompareTo() method
// returns 0 if the argument integer is equal to the integer value
// returns -1 if the argument integer is greater than the integer value
// returns 1 if the argument integer is lesser than the integer value

import javax.print.DocFlavor;

public class MaxOfNumbers<T> {

    public static void main(String args[]) {
        String obj1="Apple";
        String obj2="Peach";
        String obj3="Banana";
        String max=obj1;

        if (obj2.compareTo(max) > 0) {
            max = obj2;
        }
        if (obj3.compareTo(max) > 0) {
            max = obj3;
        }
        System.out.println("Max of three Strings is: " + max);
    }
}