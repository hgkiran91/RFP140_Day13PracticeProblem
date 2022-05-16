package com.bridgelabz.generics;

// CompareTo() method
// returns 0 if the argument integer is equal to the integer value
// returns -1 if the argument integer is greater than the integer value
// returns 1 if the argument integer is lesser than the integer value

public class MaxOfNumbers<T> {
    public static void main(String args[]) {

        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 2936, 1228, 5728, GenericClass.testMaximum(2936, 1228, 5728));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, GenericClass.testMaximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", GenericClass.testMaximum("Apple", "Peach", "Banana"));
    }
}