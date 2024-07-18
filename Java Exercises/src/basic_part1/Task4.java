package basic_part1;

/**
 * Напишите программу на Java для печати результатов следующих операций.
 * Тестовые данные:
 * а. -5 + 8 * 6
 * б. (55+9) % 9
 * в. 20+-3*5/8
 * д. 5 + 15/3 * 2 - 8 % 3
 * Ожидаемый результат:
 * 43
 * 1
 * 19
 * 13
 */

public class Task4 {
    public static void main(String[] args) {
        var a = -5 + 8 * 6;
        var b = (55 + 9) % 9;
        var c = 20 + -3 * 5 / 8;
        var d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);




    }
}
