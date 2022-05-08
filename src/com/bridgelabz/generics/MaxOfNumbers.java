package com.bridgelabz.generics;

// CompareTo() method
// returns 0 if the argument integer is equal to the integer value
// returns -1 if the argument integer is greater than the integer value
// returns 1 if the argument integer is lesser than the integer value

public class MaxOfNumbers<T> {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest
        }

        return max; // returns the largest object
    } // end method maximum

    public static void main(String args[]) {

        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(2936, 1228, 5728));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", maximum("Apple", "Peach", "Banana"));
    }
}