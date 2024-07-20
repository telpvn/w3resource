package basic_part1;


/*
    11. Напишите программу на Java для вывода площади и периметра круга.
        Тестовые данные:
            Радиус = 7,5
            Ожидаемый результат
            Периметр = 47,12388980384689.
            Площадь = 176,71458676442586.


 */
public class Task11 {
    public static void main(String[] args) {
        var Radius = 7.5;
        var Pi = Math.PI;

        var PerimeterIs = 2 * Pi * Radius;
        var AreaIs = Pi * Radius * Radius;

        System.out.println("Периметр = " + PerimeterIs);
        System.out.println("Площадь = " + AreaIs);
    }
}
