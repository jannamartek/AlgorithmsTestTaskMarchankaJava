package janna_marchanka_java.task_2;

import java.util.Scanner;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);

    static void getMessage() {
        System.out.println("Введите имя: ");
        System.out.println();
    }

    public static String getUserInput() {
        String expectedUserName = "Вячеслав";
        String inputUserName;
        inputUserName = scanner.nextLine();
        if (inputUserName.equalsIgnoreCase(expectedUserName)) {
            System.out.println("Привет, Вячеслав");
            scanner.close();
        } else if (!inputUserName.equalsIgnoreCase(expectedUserName)) {
            System.out.println("Нет такого имени");
            return getUserInput();
        }
        return inputUserName;
    }
}