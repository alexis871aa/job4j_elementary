package ru.job4j;

public class Echo {
    public static void transform(int number) {
        int num1 = number / 100;
        int num2 = number / 10 % 10;
        int num3 = number % 10;

        if (number % 2 == 0) {
            System.out.println(num1 * 100 + num2 * 10 + num3);
        }
    }

    public static void main(String[] args) {
        transform(390);     // 281
        transform(333);     // 444
        transform(-900);    // -811
        transform(999);     // 999
        transform(-109);    // -209
        transform(100);     // 11
    }
}
