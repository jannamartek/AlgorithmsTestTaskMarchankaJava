package janna_marchanka_java.task_3;


import static janna_marchanka_java.task_3.Task3.fillArray;
import static janna_marchanka_java.task_3.Task3.printArray;

/**
 * Составить алгоритм:
 * на входе есть числовой массив,
 * необходимо вывести элементы массива кратные 3
 */

public class Task3Run {
    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        printArray(values);
    }
}
