package basic_part1;

import java.util.Scanner;

/**
 * 7. Напишите программу на Java, которая принимает на вход число и печатает таблицу умножения до 10.
 * Тестовые данные:
 * Введите число: 8
 * Ожидаемый результат:
 * 8 х 1 = 8
 * 8 х 2 = 16
 * 8 х 3 = 24
 * ...
 * 8 х 10 = 80
 */

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения до 10.\n");
        System.out.println("Введите число: ");
        var i = new Scanner(System.in).nextInt();

        for (int j = 1; j <= 10; j++) {
            System.out.println(i + " " + "*" + " " + j + " " + "=" + " " + (i * j));
        }
    }
}
