package Lesson_4;

public class CountArray {
    public static void processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4)
            System.out.println("Размер массива должен быть 4x4");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println(String.format("Неверные данные в ячейке [%d][%d]", i, j));
                }
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}
