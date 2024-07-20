package basic_part1;

/*
12. Напишите программу на Java, которая принимает на вход три числа для вычисления и вывода         среднего значения этих чисел.
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Введите третье число: ");
        var c = new Scanner(System.in).nextInt();

        var result = (a + b + c) / 3;

        System.out.println("Среднее значение этих чисел равна " + result);
    }
}
