package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 15));
        System.out.println(sum(4, 8));
        System.out.println(sum(1, 1));
    }
}
