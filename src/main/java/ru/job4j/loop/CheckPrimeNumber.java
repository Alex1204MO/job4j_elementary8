package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++)
                if (number % i == 0)
                    return false;
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(check(11));
    }
}
