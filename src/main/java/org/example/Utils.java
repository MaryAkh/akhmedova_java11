package org.example;

public class Utils {

    public static void compareToNumbers(int x, int y) {
        if (x > y) {
            System.out.println(x + " > " + y);
        } else if (x < y) {
            System.out.println(x + " < " + y);
        } else {
            System.out.println(x + " = " + y);
        }
    }

    public static int sumToNumbers(int x, int y) {
        return x + y;
    }

    public static int diffToNumbers(int x, int y) {
        return x - y;
    }
    public static int multToNumbers(int x, int y) {
        return x * y;
    }
    public static int divToNumbers(int x, int y) {
        if (y == 0) {
            System.err.println("На ноль делить нельзя");
            throw new ArithmeticException();
        }

        return x / y;
    }
}


