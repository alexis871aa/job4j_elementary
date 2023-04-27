package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent /= 100;
        while (amount > 0) {
            amount += amount * percent - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int amount = 1500;
        int salary = 1200;
        double percent = 50;
        System.out.println(year(amount, salary, percent));
    }
}