package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double first = Math.pow(x, 2);
        double y = y2 - y1;
        double second = Math.pow(y, 2);
        double rsl = first + second;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 1, 2, 3);
        System.out.println("result (1, 1) to (2, 3) " + result);
        result = Point.distance(5, 4, 2, 7);
        System.out.println("result (5, 4) to (2, 7) " + result);
    }
}
