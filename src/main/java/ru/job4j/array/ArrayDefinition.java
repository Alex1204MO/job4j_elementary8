package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] price = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Ivan Niolaev";
        names[2] = "Petr Ivanov";
        names[3] = "Petr Sergeev";
        String name = names[0];
        System.out.println(name);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + price.length);
    }
}