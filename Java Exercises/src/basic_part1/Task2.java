package basic_part1;

import java.util.Scanner;

/**
 * Напишите программу на Java для вывода суммы двух чисел.
 * Тестовые данные:
 * 74 + 36
 * Ожидаемый результат:
 * 110
 */

public class Task2 {
    public static void main(String[] args) {

//        var i = 74;
//        var j = 36;
//        var sum = i + j;
//
//        System.out.println(sum);

        System.out.println("Введите первое число: ");
        var i = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        var j = new Scanner(System.in).nextInt();

        System.out.println("Вывод суммы: " + (i + j));

    }
}
