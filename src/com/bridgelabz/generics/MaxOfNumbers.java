package com.bridgelabz.generics;

// CompareTo() method
// returns 0 if the argument integer is equal to the integer value
// returns -1 if the argument integer is greater than the integer value
// returns 1 if the argument integer is lesser than the integer value

public class MaxOfNumbers<T> {

    public static void main(String args[]) {
        Integer obj1 = new Integer(76879);
        Integer obj2 = new Integer(879779);
        Integer obj3 = new Integer(21234);
        Integer max = obj1;

        if (obj2.compareTo(max) > 0) {
            max = obj2;
        } else if (obj3.compareTo(max) > 0) {
            max = obj3;
        }
        System.out.println("Max of three number is: " + max);
    }
}