package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double money = amount;
        percent /= 100;
        while (money >= 0) {
            amount += amount * percent;
            money = amount - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        System.out.println(year(amount, salary, percent));
    }
}