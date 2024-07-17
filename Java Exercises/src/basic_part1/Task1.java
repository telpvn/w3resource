package basic_part1;

import java.util.Scanner;

/**
 * Напишите программу на Java, которая выведет "Hello" на экран и ваше имя в отдельной строке.
 */

public class Task1 {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.print("Валерий ");
//        System.out.println("Планкин!");

//        ========================================================

//        System.out.println("Hello\nВалерий Планкин!");

//        =======================================================


        System.out.print("Введите свое имя: ");
        var name = new Scanner(System.in).nextLine();

        System.out.print("Введите свою фамилию: ");
        var lastName = new Scanner(System.in).nextLine();

        System.out.println("Hello\n" + name + " " + lastName);

    }
}
