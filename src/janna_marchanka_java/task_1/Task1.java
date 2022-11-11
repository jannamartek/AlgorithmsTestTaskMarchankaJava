package janna_marchanka_java.task_1;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    private static Scanner scanner = new Scanner(System.in);

    static void getMessage() {
        System.out.println("Введите число: ");
        System.out.println();
    }

    public static double getUserInput() {
        scanner.useLocale(Locale.US);
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            while (number > 7) {
                System.out.println("Привет");
                break;
            }
        } else {
            System.out.println("Вы ввели не число. Повторите ввод");
            scanner.next();
            number = getUserInput();
        }
        return number;
    }
}

