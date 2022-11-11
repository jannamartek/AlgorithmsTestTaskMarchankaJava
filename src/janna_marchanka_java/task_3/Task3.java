package janna_marchanka_java.task_3;

public class Task3 {

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print("\n Ёлементы массива кратные 3: " + values[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] values) {
        for (int currentValue = 1, currentIndex = 0; currentIndex < values.length; currentValue++) {
            if (currentValue % 3 == 0) {
                values[currentIndex++] = currentValue;
            }
        }
    }
}