package basic_part1;

import java.util.Scanner;

/**
 * Напишите программу на Java, которая принимает на вход два числа и отображает произведение двух чисел.
 * Тестовые данные:
 * Введите первое число: 25
 * Введите второе число: 5
 * Ожидаемый результат:
 * 25 х 5 = 125
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        var i = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        var j = new Scanner(System.in).nextInt();

        System.out.println("Ожидаемый результат: " + i * j);

    }
}
