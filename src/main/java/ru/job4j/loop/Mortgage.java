package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        double debt = amount + (amount * percent);
        while (debt > 0) {
            debt -= salary;
            debt += debt * percent;
            year++;
        }
        return year;
    }
}
