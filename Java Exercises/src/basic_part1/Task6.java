package basic_part1;

import java.util.Scanner;

/**
 * 6. Напишите программу на Java для вывода суммы (сложения), умножения, вычитания, деления и остатка двух чисел.
 * Тестовые данные:
 * Введите первое число: 125
 * Введите второе число: 24
 * Ожидаемый результат:
 * 125 + 24 = 149
 * 125 – 24 = 101
 * 125 х 24 = 3000
 * 125/24 = 5
 * 125 мод 24 = 5
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        var i = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        var j = new Scanner(System.in).nextInt();

        System.out.println((i + " " + "+" + " " + j) + " " + "=" + " " + (i + j));
        System.out.println((i + " " + "-" + " " + j) + " " + "=" + " " + (i - j));
        System.out.println((i + " " + "*" + " " + j) + " " + "=" + " " + (i * j));
        System.out.println((i + " " + "/" + " " + j) + " " + "=" + " " + (i / j));
        System.out.println((i + " " + "мод" + " " + j) + " " + "=" + " " + (i % j));

    }
}
