package com.bridgelabz.generics;

public class GenericClass<T> {

    T x;
    T y;
    T z;

    public GenericClass(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest
        }

        return max; // returns the largest object
    } // end method maximum
}
