package basic_part1;

import java.util.Scanner;

/**
 * Напишите программу на Java, которая разделит два числа и выведет их на экран.
 * Тестовые данные:
 * 50/3
 * Ожидаемый результат:
 * 16
 */

public class Task3 {
    public static void main(String[] args) {
        var i = 50;
        var j = 3;
        var div = i / j;

        System.out.println(div);

        System.out.println("Введите первое число: ");
        var i1 = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        var j2 = new Scanner(System.in).nextInt();

        System.out.println("Вывод: " + i1 / j2);
    }

}
