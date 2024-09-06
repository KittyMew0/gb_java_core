package geekbrains_course.java_core.seminar4.lecture_task;

class InvalidArraySizeException extends Exception {
    public InvalidArraySizeException(String message) {
        super(message);
    }
}

public class MainArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        try {
            int sum = calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (InvalidArraySizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    public static int calculateSum(int[][] array) throws InvalidArraySizeException {
        if (array.length != 5 || array[0].length != 5) {
            throw new InvalidArraySizeException("Массив должен быть размером 5x5.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        return sum;
    }
}
