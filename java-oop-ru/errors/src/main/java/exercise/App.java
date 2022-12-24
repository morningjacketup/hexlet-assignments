package exercise;

import exercise.exception.CustomException;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            System.out.println((int)Math.ceil(circle.getSquare()));
        } catch (Exception e) {
            System.out.println("Не удалось посчитать площадь");
        }
        System.out.println("Вычисление окончено");
    }
}
// END
