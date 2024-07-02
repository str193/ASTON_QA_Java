package org.example;

public class Factorial {
    public static int getFactorial(int f) {
        if (f < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        } else if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }
}
