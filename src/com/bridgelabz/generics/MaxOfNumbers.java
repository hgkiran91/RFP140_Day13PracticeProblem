package com.bridgelabz.generics;

// CompareTo() method
// returns 0 if the argument integer is equal to the integer value
// returns -1 if the argument integer is greater than the integer value
// returns 1 if the argument integer is lesser than the integer value

public class MaxOfNumbers<T> {

    public static void main(String args[]) {
        Float obj1 = new Float(737.23F);
        Float obj2 = new Float(90.2F);
        Float obj3 = new Float(111.3F);
        Float max = obj1;

        if (obj2.compareTo(max) > 0) {
            max = obj2;
        }
        if (obj3.compareTo(max) > 0) {
            max = obj3;
        }
        System.out.println("Max of three Floating number is: " + max);
    }
}