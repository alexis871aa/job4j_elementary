package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = h * l;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        /*
        double result4 = SqArea.square(10, 4);
        System.out.println(" p = 10, k = 4, s = 4, real = " + result4);
        */
    }
}
