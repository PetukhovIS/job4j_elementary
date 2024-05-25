package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(5, 8);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
    }
}
