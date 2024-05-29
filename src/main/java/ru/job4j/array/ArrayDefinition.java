package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Ilya Petukhov";
        names[2] = "Ivan Ivanov";
        names[3] = "Stas Peshkin";
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + names.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println(names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3]);

    }
}
